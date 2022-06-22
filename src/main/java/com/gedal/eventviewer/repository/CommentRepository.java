package com.gedal.eventviewer.repository;


import com.gedal.eventviewer.domain.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CommentRepository extends MongoRepository<Event, String> {
	
//	List<Event> findByTitleContaining(String text);
//	List<Event> findBydateEventAfter(Date date);
//	List<Event> findBydateEventGreaterThanEqual(Date date);
	
	
}
