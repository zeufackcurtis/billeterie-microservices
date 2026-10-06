package com.fluxdedonne.demo.repository;
import com.fluxdedonne.demo.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
