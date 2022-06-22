package com.gedal.eventviewer.dto;

import com.gedal.eventviewer.domain.Event;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class EveDTO implements Serializable {

    @Getter @Setter private String id;
    @Getter @Setter private String nameEvent;

    public EveDTO (Event obj){
        id = obj.getId();
        nameEvent = obj.getNameEvent();
    }


}