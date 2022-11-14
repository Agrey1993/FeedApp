package com.bptn.service;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bptn.exceptions.InvalidHistoryException;
import com.bptn.exceptions.InvalidUserNameException;
import com.bptn.models.History;
import com.bptn.repository.FeedHistoryRepository;

@Service
public class FeedHistoryService {

	private final Logger LOGGER=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private FeedHistoryRepository feedHistoryRepository;
	
	@Autowired
	private UserService userService;
	
	public List<History> getPostsByUsername(String userame) throws InvalidUserNameException{
		
		LOGGER.info("retrieving History from DB by username");
		userService.validateUserId(username);
		List<History> history=feedHistoryRepository.findByUsername(username);
		history=removeEmptyHistory(history);
		LOGGER.debug("Feeds History={}", history);
		
		return history;
		
	}
	
	public History getPostsId(String postID) throws InvalidHistoryException{
	
	private List<History> removeEmptyHistory(List<History> history) {
		List<History> resultHistory=new LinkedList<>();
		for(History  historyData: history) {
			if(historyData.getPostId()!=null && !historyData.getPostId().isEmpty()) {
				resultHistory.add(historyData) {
					
				}
			}
		}
	
	
	}
}
