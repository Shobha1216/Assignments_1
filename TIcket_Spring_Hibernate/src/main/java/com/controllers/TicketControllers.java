package com.controllers;


import com.models.Ticket;
import com.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/tickets")
public class TicketControllers {

    @Autowired
    @Qualifier("database")
    private TicketService ticketService;

    public TicketControllers(){

    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Ticket> getTickets(){
        return ticketService.getTickets();
    }


    @RequestMapping(value = "/{id}", method=RequestMethod.GET)
    public Ticket getTicketById(@PathVariable(name="id") int ticketId){
        return ticketService.getTicketById(ticketId);
    }

    @RequestMapping(method= RequestMethod.POST)
    public Ticket createTicket(@RequestBody Ticket  ticket){
        ticketService.createTicket(ticket);
        return ticket;

    }

    @RequestMapping(method = RequestMethod.PUT)
    public Ticket updateTicket(@RequestBody Ticket ticket){
        ticketService.updateTicket(ticket);
        return ticket;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public  Ticket deleteTicket(@RequestBody Ticket ticket){
        ticketService.DeleteTicket(ticket);
        return ticket;
    }
}
