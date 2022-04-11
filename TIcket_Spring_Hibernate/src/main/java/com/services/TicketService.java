package com.services;

import com.models.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> getTickets();

    Ticket getTicketById(int ticketId);

    String createTicket(Ticket ticket);

   String updateTicket(Ticket ticket);
   String deleteTicket(Ticket ticket);




}
