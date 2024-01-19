package com.ashokit.service;

import com.ashokit.binding.Passenger;
import com.ashokit.binding.Ticket;
import org.springframework.http.ResponseEntity;

import java.util.Collection;
import java.util.List;

public interface TicketService {

    ResponseEntity<Ticket> bookTicket(Passenger passenger);

    ResponseEntity<Collection<Ticket>> getAllTickets();
}
