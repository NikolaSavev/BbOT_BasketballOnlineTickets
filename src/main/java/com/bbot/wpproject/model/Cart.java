package com.bbot.wpproject.model;

import java.time.LocalDateTime;
import java.util.List;

public class Cart {

    private Long Id;

    private List<Ticket> Tickets;

    private User User;

    private LocalDateTime DateCreated;

    private ShoppingCartStatus status;

}
