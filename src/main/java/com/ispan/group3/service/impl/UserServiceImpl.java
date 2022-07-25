package com.ispan.group3.service.impl;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.ispan.group3.repository.UserData;
import com.ispan.group3.repository.UserRepository;
import com.ispan.group3.service.UserService;

import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.utility.RandomString;


//@SuppressWarnings("deprecation")
@Service
@Primary
//@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Autowired
    private JavaMailSender mailSender;
	
//	@Override
//	public void register(UserData user) {
//		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//		System.out.println("------------------------test-------------------------");
//    	String randomCode = RandomString.make(64);
//    	
////    	user.setVerificationCode(randomCode);
////    	user.setEnabled(false);
//    	user.setUsername(user.getUsername());
//		user.setPassword(passwordEncoder.encode(user.getPassword()));
//		user.setAuthority("ROLE_USER");  //註冊預設是顧客
//         
//         
//        userRepository.save(user);
//		
//	}
 
	@Override
    public void register(UserData user, String siteURL) throws UnsupportedEncodingException, MessagingException {
    	
    	PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    	
    	String randomCode = RandomString.make(64);
    	
    	user.setVerificationCode(randomCode);
    	user.setEnabled(false);
    	user.setUsername(user.getUsername());
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setAuthority("ROLE_USER");  //註冊預設是顧客
         
        userRepository.save(user);
         
        sendVerificationEmail(user, siteURL);
     
    }
     
    private void sendVerificationEmail(UserData user, String siteURL) throws MessagingException, UnsupportedEncodingException {
        String toAddress = user.getUsername();
        String fromAddress = "aq855230@gmail.com";
        String senderName = "GoTrip";
        String subject = "GoTrip!帳戶驗證信";
        String content = "Dear [[name]],<br>"
                + "請點擊下方連結，立即開通您的帳戶：<br>"
                + "<h3><a href=\"[[URL]]\" target=\"_self\">驗證連結，點擊返回GoTrip</a></h3>"
                + "謝謝！<br>"
                + "GoTrip團隊歡迎您的加入";
         
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
         
        helper.setFrom(fromAddress, senderName);
        helper.setTo(toAddress);
        helper.setSubject(subject);
         
        content = content.replace("[[name]]", user.getUsername());
        String verifyURL = siteURL + "/verify?code=" + user.getVerificationCode();
         
        content = content.replace("[[URL]]", verifyURL);
         
        helper.setText(content, true);
         
        mailSender.send(message);
     
    }
    
    
    @Override
    public boolean verify(String verificationCode) {
        UserData user = userRepository.findByVerificationCode(verificationCode);
         
        if (user == null || user.isEnabled()) {
            return false;
        } else {
            user.setVerificationCode(null);
            user.setEnabled(true);
            userRepository.save(user);
            return true;
        }
         
    }


	@Override
	public void saveOrUpdate(UserData user) {
		userRepository.save(user);
	}


	@Override
	public List<UserData> getAllUsers() {
		return userRepository.findAll();
	}


	@Override
	public UserData getUser(int user_id) {
		return userRepository.findById(user_id).get();
	}


	@Override
	public void deleteUser(int user_id) {
		boolean exists = userRepository.existsById(user_id);
		if (!exists) {
			throw new IllegalStateException("User with id " + user_id + " does not exist");
		}
		userRepository.deleteById(user_id);
	}


	public UserData findByUsername(String username) throws NullPointerException {
		return userRepository.findByUsername(username);
	}



}
