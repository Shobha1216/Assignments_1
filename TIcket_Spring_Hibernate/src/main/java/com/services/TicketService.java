package com.services;

import com.models.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> getTickets();

    Ticket getTicketById(int ticketId);

    Ticket createTicket(Ticket ticket);

   Ticket updateTicket(Ticket ticket);
   Ticket DeleteTicket(Ticket ticket);




}
