package com.bbot.wpproject.model;

import com.bbot.wpproject.model.enumeration.ShoppingCartStatus;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @ManyToMany
    private List<Ticket> Tickets;

    @ManyToOne
    private User User;

    private LocalDateTime DateCreated;

    @Enumerated(EnumType.STRING)
    private ShoppingCartStatus status;

    public Cart() {
    }

    public Cart(User user) {
        Tickets = new ArrayList<>();
        User = user;
        DateCreated = LocalDateTime.now();
        this.status = status;
    }

    public Long getId() {
        return Id;
    }

    public List<Ticket> getTickets() {
        return Tickets;
    }

    public com.bbot.wpproject.model.User getUser() {
        return User;
    }

    public LocalDateTime getDateCreated() {
        return DateCreated;
    }

    public ShoppingCartStatus getStatus() {
        return status;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setTickets(List<Ticket> tickets) {
        Tickets = tickets;
    }

    public void setUser(com.bbot.wpproject.model.User user) {
        User = user;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        DateCreated = dateCreated;
    }

    public void setStatus(ShoppingCartStatus status) {
        this.status = status;
    }
}
