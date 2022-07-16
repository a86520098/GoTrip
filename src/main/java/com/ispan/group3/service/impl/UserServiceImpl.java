package com.ispan.group3.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.ispan.group3.repository.User;
import com.ispan.group3.repository.UserRepository;
import com.ispan.group3.service.UserService;

import lombok.extern.slf4j.Slf4j;

//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
//import org.springframework.security.crypto.password.StandardPasswordEncoder;
//import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

//@SuppressWarnings("deprecation")
@Service
@Primary
@Slf4j
//@Transactional
public class UserServiceImpl implements UserService {
	
//    private final static Map<Integer, String> ENCODER_TYPE = new HashMap<>();
//
//    private final static Map<String, PasswordEncoder> ENCODER_MAP = new HashMap<>();
//
//    private final static String PASSWORD_FORMAT = "{%s}%s";
//
	private final UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
//	static {
//        ENCODER_TYPE.put(0, "noop");
//        ENCODER_TYPE.put(1, "bcrypt");
//        ENCODER_TYPE.put(2, "pbkdf2");
//        ENCODER_TYPE.put(3, "scrypt");
//        ENCODER_TYPE.put(4, "sha256");
//        ENCODER_MAP.put("noop", NoOpPasswordEncoder.getInstance());
//        ENCODER_MAP.put("bcrypt", new BCryptPasswordEncoder());
//        ENCODER_MAP.put("pbkdf2", new Pbkdf2PasswordEncoder());
//        ENCODER_MAP.put("scrypt", new SCryptPasswordEncoder());
//        ENCODER_MAP.put("sha256", new StandardPasswordEncoder());
//    }

	@Override
	public void saveOrUpdate(User user) {
//		// 随机使用加密方式
//        Random random = new Random();
//        int x = random.nextInt(5);
//        String encoderType = ENCODER_TYPE.get(x);
//        PasswordEncoder passwordEncoder = ENCODER_MAP.get(encoderType);
//        user.setPassword(String.format(PASSWORD_FORMAT, encoderType, passwordEncoder.encode(user.getPassword())));
		userRepository.save(user);
	}


	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}


	@Override
	public User getUser(int user_id) {
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


	public User getByEmail(String Email) throws NullPointerException {
		return userRepository.getByEmail(Email);
	}


//	@Override
//	public int updateMember(MemberBean mb) {
//		return DAO.updateMember(mb);
//	}

//	@Override
//	public boolean isDup(String id) {
//		boolean result = false;
//		Session session = factory.getCurrentSession();
//		Transaction tx = null;
//		try {
//			tx = session.beginTransaction();
//			result = DAO.isDup(id);
//			tx.commit();
//		} catch (Exception ex) {
//			if (tx != null) {
//				tx.rollback();
//			}
//			throw new RuntimeException(ex);
//		}
//		return result;
//	}

//	@Override
//	public int save(MemberBean mb) {
//		int n = 0;
//		Session session = factory.getCurrentSession();
//		Transaction tx = null;
//		try {
//			tx = session.beginTransaction();
//			n = DAO.save(mb);
//			tx.commit();
//		} catch (Exception ex) {
//			if (tx != null) {
//				tx.rollback();
//			}
//			throw new RuntimeException(ex);
//		}
//		return n;
//	}
//
//	@Override
//	public List<MemberBean> getAllMembers() {
//		List<MemberBean> memberBeans = null;
//		Session session = factory.getCurrentSession();
//		Transaction tx = null;
//		try {
//			tx = session.beginTransaction();
//			memberBeans = DAO.getAllMembers();
//			tx.commit();
//		} catch (Exception ex) {
//			if (tx != null) {
//				tx.rollback();
//			}
//			throw new RuntimeException(ex);
//		}
//		
//		return memberBeans;
//	}
//
//	@Override
//	public MemberBean getMember(int user_no) {
//		MemberBean memberBean = null;
//		Session session = factory.getCurrentSession();
//		Transaction tx = null;
//		try {
//			tx = session.beginTransaction();
//			memberBean = DAO.getMember(user_no);
//			tx.commit();
//		} catch (Exception ex) {
//			if (tx != null) {
//				tx.rollback();
//			}
//			throw new RuntimeException(ex);
//		}
//		return memberBean;
//	}
//
//	@Override
//	public int deleteMember(int user_no) {
//		
//		int n = 0;
//		Session session = factory.getCurrentSession();
//		Transaction tx = null;
//		try {
//			tx = session.beginTransaction();
//			n = DAO.deleteMember(user_no);
//			tx.commit();
//		} catch (Exception ex) {
//			if (tx != null) {
//				tx.rollback();
//			}
//			throw new RuntimeException(ex);
//		}
//		return n;
//	}
//
//	@Override
//	public int updateMember(MemberBean mb) {
//		
//		int n = 0;
//		Session session = factory.getCurrentSession();
//		Transaction tx = null;
//		try {
//			tx = session.beginTransaction();
//			n = DAO.updateMember(mb);
//			tx.commit();
//		} catch (Exception ex) {
//			if (tx != null) {
//				tx.rollback();
//			}
//			throw new RuntimeException(ex);
//		}
//		return n;
//	}

}
