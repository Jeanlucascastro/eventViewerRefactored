package com.gedal.eventviewer.rent;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class rentTelescope {

    @Getter @Setter private String model;

    @Getter @Setter private Enum type;
    @Getter @Setter private Date initialDate;
    @Getter @Setter private Date finalDate;

    public rentTelescope(){}

    public rentTelescope(String model, Enum type, Date initialDate, Date finalDate) {
        this.model = model;
        this.type = type;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
    }
}
