package com.medium.springjpa.service;

import java.util.List;

import com.medium.springjpa.entity.Tweet;

public interface TweetService {
	
	List<Tweet> getTweet(String tweetSearchTerm);

}
