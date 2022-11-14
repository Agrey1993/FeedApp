package com.bptn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bptn.models.ImageMetaData;

@Repository
public interface FeedImageMetaDatRepository extends JpaRepository<ImageMetaData, String> {

	ImageMetaData findByImageid(String imageID);
	
	List<ImageMetaData> findByPostkey(String postkey);
}
