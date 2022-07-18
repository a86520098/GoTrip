//package com.ispan.group3.repository.impl;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
//import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
//import org.springframework.jdbc.core.namedparam.SqlParameterSource;
//import org.springframework.jdbc.support.GeneratedKeyHolder;
//import org.springframework.jdbc.support.KeyHolder;
//import org.springframework.stereotype.Repository;
//
//import com.ispan.group3.repository.UserAccount;
//import com.ispan.group3.repository.UserAccountDao;
//
//
//@Repository
//public class UserAccountDaoImpl implements UserAccountRepository {
//
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//
//	@Autowired
//	private NamedParameterJdbcTemplate jdbcNameTemplate;
//
//	@Override
//	public Integer insert(UserAccount userAccount) {
//		String sql = " INSERT INTO user_data ( EMAIL, PASSWORD, SALT ) VALUES ( :email, :password, :salt ) ; ";
//
//		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(userAccount);
//		KeyHolder keyHolder = new GeneratedKeyHolder();
//
//		jdbcNameTemplate.update(sql, paramSource, keyHolder);
//		return keyHolder.getKey().intValue();
//	}
//
//	@Override
//	public UserAccount findMemberAccountByEmail(String email) {
//		String sql = " SELECT "
//				   + "		USER_ID, EMAIL, PASSWORD, SALT "
//				   + " FROM "
//				   + "		user_data "
//				   + " WHERE "
//				   + "		EMAIL = ? ";
//
//		List<UserAccount> result = jdbcTemplate.query(sql, new BeanPropertyRowMapper<UserAccount>(UserAccount.class), new Object[] { email });
//		if(result != null && result.size() > 0) {
//			return result.get(0);
//		}
//		return null;
//	}
//
//	@Override
//	public Integer update(UserAccount userAccount) {
//		String sql = " UPDATE "
//				   + "		user_data "
//				   + " SET "
////				   + "		PASSWORD = :password, UPDATE_BY = :update_by, UPDATE_TIME = NOW() "
//				   + "		PASSWORD = :password "
//				   + " WHERE "
//				   + "		USER_ID = :user_id ";
//
//		SqlParameterSource paramSource = new BeanPropertySqlParameterSource(userAccount);
//		return jdbcNameTemplate.update(sql, paramSource);
//	}
//
//
//}
