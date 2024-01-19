package com.ashokit.service;

import com.ashokit.binding.Passenger;
import com.ashokit.binding.Ticket;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TicketServiceImpl implements TicketService{

    Map<Integer,Ticket> db=new HashMap();

    @Override
    public ResponseEntity<Ticket> bookTicket(Passenger passenger) {
        Ticket t=new Ticket();

        Random r=new Random();
        long ticketId = r.nextInt(100);
        BeanUtils.copyProperties(passenger,t);

       t.setTicketId(ticketId);
       t.setStatus("Confirmed");
        int id = r.nextInt(10);
        db.put(id,t);
        return new ResponseEntity<>(t,HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Collection<Ticket>> getAllTickets() {
        System.out.println(db);
        return new ResponseEntity<>(db.values(),HttpStatus.OK);
    }
}
