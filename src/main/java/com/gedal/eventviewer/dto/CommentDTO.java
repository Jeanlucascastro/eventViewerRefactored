package com.gedal.eventviewer.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class CommentDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Getter @Setter private String text;
	@Getter @Setter private Date date;
	@Getter @Setter private String author;
	
	public CommentDTO() {
		
	}

	public CommentDTO(String text, Date date, String author) {
		super();
		this.text = text;
		this.date = date;
		this.author = author;
	}
	
	
}
