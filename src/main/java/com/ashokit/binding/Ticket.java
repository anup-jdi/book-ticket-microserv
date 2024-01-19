package com.ashokit.binding;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Ticket {

    private Long ticketId;
    private  String name ;
    private String mail;
    private int noOfTickets;
    private  String dateOfJourney;
    private String from;
    private String to;
    private String trainNo;
    private String status;

}
