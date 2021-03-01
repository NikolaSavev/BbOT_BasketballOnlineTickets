package com.bbot.wpproject.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private boolean IsTaken;

    public Seat(boolean isTaken) {
        IsTaken = isTaken;
    }

    public Seat() {
    }

    public Long getId() {
        return Id;
    }

    public boolean isTaken() {
        return IsTaken;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setTaken(boolean taken) {
        IsTaken = taken;
    }
}
