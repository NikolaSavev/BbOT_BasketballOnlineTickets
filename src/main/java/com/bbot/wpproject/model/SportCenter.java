package com.bbot.wpproject.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class SportCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @OneToMany
    private List<Seat> Seats;

    private String Name;

    private String Location;

    public SportCenter() {
    }

    public SportCenter(String name, String location) {
        Seats = new ArrayList<>();
        Name = name;
        Location = location;
    }

    public Long getId() {
        return Id;
    }

    public List<Seat> getSeats() {
        return Seats;
    }

    public String getName() {
        return Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setSeats(List<Seat> seats) {
        Seats = seats;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
