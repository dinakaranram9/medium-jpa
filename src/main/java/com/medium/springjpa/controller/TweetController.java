package com.medium.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.medium.springjpa.entity.Tweet;
import com.medium.springjpa.service.TweetService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/medium")
@Api(value = "API to get tweets")
public class TweetController {
	
	@Autowired
	TweetService tweetService;
	
	@GetMapping("/getTweets")
	@ApiOperation("api to get tweets between ids")
	List<Tweet> getTweet(@RequestParam String tweetSearchTerm) {
		return tweetService.getTweet(tweetSearchTerm);
	}

}
