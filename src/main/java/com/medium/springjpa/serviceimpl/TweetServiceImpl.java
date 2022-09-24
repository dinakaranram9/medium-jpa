package com.medium.springjpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medium.springjpa.entity.Tweet;
import com.medium.springjpa.repository.TweetRepository;
import com.medium.springjpa.service.TweetService;

@Service
public class TweetServiceImpl implements TweetService{

	@Autowired
	TweetRepository tweetRepository;
	
	@Override
	public List<Tweet> getTweet(String tweetSearchTerm) {
		
		return null;
	}

}
