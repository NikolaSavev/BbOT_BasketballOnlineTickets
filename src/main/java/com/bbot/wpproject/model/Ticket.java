package com.bbot.wpproject.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    private Match Match;

    private Double Price;

    public Ticket() {
    }

    public Ticket(com.bbot.wpproject.model.Match match, Double price) {
        Match = match;
        Price = price;
    }

    public Long getId() {
        return Id;
    }

    public com.bbot.wpproject.model.Match getMatch() {
        return Match;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setMatch(com.bbot.wpproject.model.Match match) {
        Match = match;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Double getPrice() {
        return Price;
    }
}
