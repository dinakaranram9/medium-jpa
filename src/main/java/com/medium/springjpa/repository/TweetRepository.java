package com.medium.springjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medium.springjpa.entity.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Integer>{
	
	List<Tweet> findByTweetStartsWithIgnoreCase(String tweetSearchTerm);
}
