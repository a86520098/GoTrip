//package com.ispan.group3.config;
//
//import java.sql.Timestamp;
//import java.util.Random;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.ispan.group3.repository.Comment;
//import com.ispan.group3.service.CommentService;
//
//@Configuration
//public class CommentConfig {
//	
//	private final CommentService cService;
//
//	public CommentConfig(CommentService cService) {
//		this.cService = cService;
//	}
//	
//	@Bean
//	CommandLineRunner carLocationRunner() {
//		Random rand = new Random();;
//        
//		return args -> {
//			for (int i = 0; i < 50; i++) {
//				int randItemId = rand.nextInt(10); //0-9
//				randItemId += 1; //1-10
//				int randUserId = rand.nextInt(1000); //0-9
//				randUserId += 1; //1-10
//				int randRating = rand.nextInt(3); //0-4
//				randRating += 3;
//
//				Comment comment = new Comment("carRental", randItemId, "account" + randUserId, new Timestamp(System.currentTimeMillis()), randRating, "", "show");
//				cService.insertComment(comment);
//				
//			}
//
//		};
//	}
//
//}
