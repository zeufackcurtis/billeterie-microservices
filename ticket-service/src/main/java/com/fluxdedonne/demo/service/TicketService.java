package com.fluxdedonne.demo.service;
import  com.fluxdedonne.demo.model.Ticket;
import java.util.List;
public interface TicketService {
    Ticket createTicket(Ticket ticket);
    List<Ticket> getAllTickets();
    Ticket getTicketById(Long id);
    Ticket updateTicket(long id, Ticket ticketDetails);
   // void deleteTicketById(Long id);

    void deleteTicket(Long id);
}

