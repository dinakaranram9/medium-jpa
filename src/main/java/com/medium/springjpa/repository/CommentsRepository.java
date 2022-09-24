package com.medium.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medium.springjpa.entity.Comments;

@Repository
public interface CommentsRepository extends JpaRepository<Comments, Integer> {

}
