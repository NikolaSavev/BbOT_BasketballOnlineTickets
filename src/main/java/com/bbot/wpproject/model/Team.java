package com.bbot.wpproject.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String Name;

    private String Logo;

    public Team() {
    }

    public Team(String name, String logo) {
        Name = name;
        Logo = logo;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }
}
