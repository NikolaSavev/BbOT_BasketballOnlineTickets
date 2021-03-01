package com.bbot.wpproject.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToOne
    private Team HomeTeam;

    @ManyToOne
    private Team AwayTeam;

    private String Description;

    @ManyToOne
    private SportCenter SportCenter;

    public Match() {
    }

    public Match(Team homeTeam, Team awayTeam, String description, SportCenter sportCenter) {
        HomeTeam = homeTeam;
        AwayTeam = awayTeam;
        Description = description;
        SportCenter = sportCenter;
    }

    public Long getId() {
        return Id;
    }

    public Team getHomeTeam() {
        return HomeTeam;
    }

    public Team getAwayTeam() {
        return AwayTeam;
    }

    public String getDescription() {
        return Description;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setHomeTeam(Team homeTeam) {
        HomeTeam = homeTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        AwayTeam = awayTeam;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public com.bbot.wpproject.model.SportCenter getSportCenter() {
        return SportCenter;
    }

    public void setSportCenter(com.bbot.wpproject.model.SportCenter sportCenter) {
        SportCenter = sportCenter;
    }
}
