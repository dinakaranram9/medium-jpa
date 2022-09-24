package com.medium.springjpa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tweet")
@Data
public class Tweet {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tweet_id_seq")
	@SequenceGenerator(sequenceName = "tweet_id_seq", allocationSize = 1, name = "tweet_id_seq")
	private Integer id;

	@Column(name = "tweet")
	private String tweet;

	@OneToMany(mappedBy = "tweet", orphanRemoval = true, cascade = CascadeType.ALL)
	private List<Comments> comments = new ArrayList<>();
}
