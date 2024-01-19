package com.ashokit.controller;

import com.ashokit.binding.Passenger;
import com.ashokit.binding.Ticket;
import com.ashokit.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping("/book")
    public ResponseEntity<Ticket> bookTicket(@RequestBody Passenger p){
        ResponseEntity<Ticket> ticket = ticketService.bookTicket(p);
        return ticket;
    }

    @GetMapping("/get")
    public ResponseEntity<Collection<Ticket>> getAllTickets(){
        ResponseEntity<Collection<Ticket>> allTickets = ticketService.getAllTickets();
        return allTickets;
    }
}
