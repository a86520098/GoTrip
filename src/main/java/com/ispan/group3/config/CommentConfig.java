package com.ispan.group3.config;

import java.sql.Timestamp;
import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ispan.group3.repository.Comment;
import com.ispan.group3.service.CommentService;

@Configuration
public class CommentConfig {
	
	private final CommentService cService;

	public CommentConfig(CommentService cService) {
		this.cService = cService;
	}
	
	@Bean
	CommandLineRunner carCommentRunner() {
		Random rand = new Random();
        
		return args -> {
			for (int i = 0; i < 75; i++) {
				int randItemId = rand.nextInt(20); //0-9
				randItemId += 1; //1~20
				int randUserId = rand.nextInt(1000); //0-9
				randUserId += 1; //1~1000
				int randRating = rand.nextInt(3); //0-2
				randRating += 3; //3~5
				Comment comment = new Comment("carRental", randItemId, "account" + randUserId, new Timestamp(System.currentTimeMillis()), randRating, "", "show");
				cService.save(comment);
			}

		};
	}
	
	@Bean
	CommandLineRunner ticketCommentRunner() {
		Random rand = new Random();
		
		return args -> {
			for (int i = 0; i < 75; i++) {
				int randItemId = rand.nextInt(20); //0-9
				randItemId += 1; //1~20
				int randUserId = rand.nextInt(1000); //0-9
				randUserId += 1; //1~1000
				int randRating = rand.nextInt(3); //0-2
				randRating += 3; //3~5
				Comment comment = new Comment("ticket", randItemId, "account" + randUserId, new Timestamp(System.currentTimeMillis()), randRating, "", "show");
				cService.save(comment);
			}
			
		};
	}
	
	@Bean
	CommandLineRunner hotelCommentRunner() {
		Random rand = new Random();
		
		return args -> {
			for (int i = 0; i < 75; i++) {
				int randItemId = rand.nextInt(20); //0-9
				randItemId += 1; //1~20
				int randUserId = rand.nextInt(1000); //0-9
				randUserId += 1; //1~1000
				int randRating = rand.nextInt(3); //0-2
				randRating += 3; //3~5
				Comment comment = new Comment("hotel", randItemId, "account" + randUserId, new Timestamp(System.currentTimeMillis()), randRating, "", "show");
				cService.save(comment);
			}
			
		};
	}

}
