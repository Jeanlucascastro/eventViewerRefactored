package com.gedal.eventviewer.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document
public class Comment implements Serializable {

    @Id
    @Getter @Setter private String id;
    @Getter @Setter private Date date;
    @Getter @Setter private String body;
    @Getter @Setter private String author;
    @Getter @Setter private Event eve;


    public Comment (){
    }

    public Comment(String id, Date date, String body, String author, Event eve) {
        this.id = id;
        this.date = date;
        this.body = body;
        this.author = author;
        this.eve = eve;
    }
}