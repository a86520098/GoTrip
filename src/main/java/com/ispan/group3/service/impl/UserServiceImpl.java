package com.ispan.group3.service.impl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.ispan.group3.repository.UserData;
import com.ispan.group3.repository.UserRepository;
import com.ispan.group3.service.UserService;

import lombok.extern.slf4j.Slf4j;


//@SuppressWarnings("deprecation")
@Service
@Primary
//@Transactional
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
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
