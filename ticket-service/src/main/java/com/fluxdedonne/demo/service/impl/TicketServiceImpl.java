package com.fluxdedonne.demo.service.impl;

import com.fluxdedonne.demo.model.Ticket;
import com.fluxdedonne.demo.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
//public class TicketServiceImpl {
@Service
public class TicketServiceImpl implements TicketService {
    @Override
    public Ticket createTicket(Ticket ticket) {
        return null;
    }

    @Override
    public List<Ticket> getAllTickets() {
        return List.of();
    }

    @Override
    public Ticket getTicketById(Long id) {
        return null;
    }

    @Override
    public Ticket updateTicket(long id, Ticket ticketDetails) {
        return null;
    }

    @Override
    public void deleteTicketById(Long id) {

    }

    @Override
    public void deleteTicket(Long id) {

    }
    // Vos méthodes d'implémentation
}


