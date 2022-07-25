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
	private static String[] contentArray = {"非常糟糕...","超級不推...","下次不會再來了!","實際與照片差很多","以這價位而言還不錯", "超棒的服務與品質! 物超所值"};
	
	public CommentConfig(CommentService cService) {
		this.cService = cService;
	}
	
	@Bean
	CommandLineRunner carCommentRunner() {
		Random rand = new Random();
        
		return args -> {
			for (int i = 0; i < 75; i++) {
				int randItemId = rand.nextInt(25); //0-24
				randItemId += 1; //1~20
				int randUserId = rand.nextInt(1000); //0-999
				randUserId += 1; //1~1000
				int randRating = rand.nextInt(3); //0-2
				randRating += 3; //3~5
				Comment comment = new Comment("carRental", randItemId, "user" + randUserId, new Timestamp(System.currentTimeMillis()), randRating, contentArray[randRating], "顯示");
				cService.save(comment);
			}

		};
	}
	
	@Bean
	CommandLineRunner ticketCommentRunner() {
		Random rand = new Random();
		
		return args -> {
			for (int i = 0; i < 75; i++) {
				int randItemId = rand.nextInt(10); //0-9
				randItemId += 1; //1~10
				int randUserId = rand.nextInt(1000); //0-999
				randUserId += 1; //1~1000
				int randRating = rand.nextInt(4); //0-3
				randRating += 2; //2~5
				Comment comment = new Comment("ticket", randItemId, "user" + randUserId, new Timestamp(System.currentTimeMillis()), randRating,  contentArray[randRating], "顯示");
				cService.save(comment);
			}
			
		};
	}
	
	@Bean
	CommandLineRunner hotelCommentRunner() {
		Random rand = new Random();
		
		return args -> {
			for (int i = 0; i < 75; i++) {
				int randItemId = rand.nextInt(48); //0-47
				randItemId += 1; //1~20
				int randUserId = rand.nextInt(1000); //0-9
				randUserId += 1; //1~1000
				int randRating = rand.nextInt(4); //0-3
				randRating += 2; //2~5
				Comment comment = new Comment("hotel", randItemId, "user" + randUserId, new Timestamp(System.currentTimeMillis()), randRating,  contentArray[randRating], "顯示");
				cService.save(comment);
			}
			
		};
	}

}
