package com.bptn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bptn.models.History;

@Repository
public interface FeedHistoryRepository extends JpaRepository<History, String> {

List<History> findByUsername(String usernamekey);
	
	History findByPostId(String postID);
	
	History findByPostType(String postType);
	
	void deleteByPostType(String postType);
}
