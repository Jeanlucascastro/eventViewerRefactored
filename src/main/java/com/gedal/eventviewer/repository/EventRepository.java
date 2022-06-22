package com.gedal.eventviewer.repository;



import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gedal.eventviewer.domain.Event;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {
	
//	List<Event> findByTitleContaining(String text);
	List<Event> findBydateEventAfter(Date date);
	List<Event> findBydateEventGreaterThanEqual(Date date);
	
	
}
