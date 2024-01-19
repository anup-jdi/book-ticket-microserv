package com.ashokit.binding;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Passenger {

    private  String name ;
    private String mail;
    private int noOfTickets;
    private  String dateOfJourney;
    private String from;
    private String to;
    private String trainNo;

}
