//package com.fluxdedonne.demo.service.impl;
//
//import com.fluxdedonne.demo.model.Ticket;
//import com.fluxdedonne.demo.service.TicketService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
////@Service
////public class TicketServiceImpl {
//@Service
//public class TicketServiceImpl implements TicketService {
//    @Override
//    public Ticket createTicket(Ticket ticket) {
//        return null;
//    }
//
//    @Override
//    public List<Ticket> getAllTickets() {
//        return List.of();
//    }
//
//    @Override
//    public Ticket getTicketById(Long id) {
//        return null;
//    }
//
//    @Override
//    public Ticket updateTicket(long id, Ticket ticketDetails) {
//        return null;
//    }

//    @Override
//    public void deleteTicketById(Long id) {
//
//    }
//
//    @Override
//    public void deleteTicket(Long id) {
//
//    }
//}
//
//
package com.fluxdedonne.demo.service.impl;

import com.fluxdedonne.demo.model.Ticket;
import com.fluxdedonne.demo.repository.TicketRepository;
import com.fluxdedonne.demo.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    // Injection de dépendance par constructeur
    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ticket non trouvé avec l'ID : " + id));
    }
    @Override
    public Ticket updateTicket(long id, Ticket ticketDetails) {
        Ticket ticket = getTicketById(id);
        // ticket.setXxx(ticketDetails.getXxx()); pour chaque champ
        return ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}
