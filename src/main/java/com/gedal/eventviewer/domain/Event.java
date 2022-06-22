package com.gedal.eventviewer.domain;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;


import lombok.Getter;
import lombok.Setter;

import javax.xml.stream.events.Comment;

@Document(collection="event")
public class Event implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@Getter @Setter private String id;
	@Getter @Setter private String nameEvent;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Getter @Setter private Date dateEvent;
	@Getter @Setter private String description;
	@Getter @Setter private String location;
	@Getter @Setter private String howToSee;

	@DBRef
	@Getter @Setter private List<Comment> comments = new ArrayList<>();



//	@Getter @Setter private CommentDTO comment;


	
	public Event() {
	}

	public Event(String id, String nameEvent, Date dateEvent, String description, String location, String howToSee, List<Comment> comments) {
		this.id = id;
		this.nameEvent = nameEvent;
		this.dateEvent = dateEvent;
		this.description = description;
		this.location = location;
		this.howToSee = howToSee;
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateEvent == null) ? 0 : dateEvent.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((nameEvent == null) ? 0 : nameEvent.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (dateEvent == null) {
			if (other.dateEvent != null)
				return false;
		} else if (!dateEvent.equals(other.dateEvent))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (nameEvent == null) {
			if (other.nameEvent != null)
				return false;
		} else if (!nameEvent.equals(other.nameEvent))
			return false;
		return true;
	}
	
	
	
	
}
