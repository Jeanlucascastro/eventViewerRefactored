package com.gedal.eventviewer.services;

import com.gedal.eventviewer.domain.Event;
import com.gedal.eventviewer.dto.EventDTO;
import com.gedal.eventviewer.repository.EventRepository;
import com.gedal.eventviewer.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
	
	@Autowired
	private EventRepository repo;
	
	
	//return next events including current day events
	public List<Event> findAll(){
		Instant today = Instant.now();
		return repo.findByDateEventGreaterThanEqual(today);
	}
	
	
	// return next events after the current date
	public List<Event> FindToday(){
		Instant today = Instant.now();
		return repo.findByDateEventGreaterThanEqual(today);
	}
	
//	public List<Event> findByTitle(String text){
//		return repo.findByTitleContaining(text);
//	}
	

	
	public Event findById(String id) {
		Optional<Event> event = repo.findById(id);
		return event.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	
	public Event insert(Event obj) {
		return repo.insert(obj);
	}
	
	public Event fromDTO(EventDTO objDTO) {
		return new Event(objDTO.getId(), 
				objDTO.getNameEvent(),
				objDTO.getDateEvent(), 
				objDTO.getDescription(),
				objDTO.getLocation(), 
				objDTO.getHowToSee());
//				objDTO.getComment());
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public Event update(Event obj) {
		Event newObj = findById(obj.getId());
		updateData(newObj, obj);
		return repo.save(newObj);
		
	}

	private void updateData(Event newObj, Event obj) {
		newObj.setNameEvent(obj.getNameEvent());
		newObj.setDateEvent(obj.getDateEvent());
		newObj.setDescription(obj.getDescription());
		newObj.setLocation(obj.getLocation());
		newObj.setHowToSee(obj.getHowToSee());
	}
	
	
	
}
