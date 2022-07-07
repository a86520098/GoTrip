package com.ispan.group3.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ispan.group3.repository.Member;
import com.ispan.group3.repository.MemberRepository;
import com.ispan.group3.service.MemberService;


@Service
//@Transactional
public class MemberServiceImpl implements MemberService {

	private final MemberRepository memberRepository;
	
	@Autowired
	public MemberServiceImpl(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}


	@Override
	public void saveOrUpdate(Member mb) {
		memberRepository.save(mb);
	}


	@Override
	public List<Member> getAllMembers() {
		return memberRepository.findAll();
	}


	@Override
	public Member getMember(int user_id) {
		return memberRepository.findById(user_id).get();
	}


	@Override
	public void deleteMember(int user_id) {
		boolean exists = memberRepository.existsById(user_id);
		if (!exists) {
			throw new IllegalStateException("Member with id " + user_id + " does not exist");
		}
		memberRepository.deleteById(user_id);
	}


	@Override
	public Member getByEmail(String Email) throws NullPointerException {
		return memberRepository.getByEmail(Email);
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
