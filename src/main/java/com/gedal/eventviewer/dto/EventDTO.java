package com.gedal.eventviewer.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.gedal.eventviewer.domain.Event;

import lombok.Getter;
import lombok.Setter;

import javax.xml.stream.events.Comment;

public class EventDTO implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	@Getter @Setter private String id;
	@Getter @Setter private String nameEvent;
	@Getter @Setter private Date dateEvent;
	@Getter @Setter private String description;
	@Getter @Setter private String location;
	@Getter @Setter private String howToSee;
	
	@Getter @Setter private List<Comment> comments = new ArrayList<>();
	
	public EventDTO() {
		
	}
	
	public EventDTO(Event obj) {
		id = obj.getId();
		nameEvent = obj.getNameEvent();
		dateEvent = obj.getDateEvent();
		description = obj.getDescription();
		location = obj.getLocation();
		howToSee = obj.getHowToSee();
		comments = obj.getComments();
		
	}


	public List<Comment> getComment() {
		return getComments();
	}
}
