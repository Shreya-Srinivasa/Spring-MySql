package com.example.spring.mysql.dao;

import org.springframework.data.repository.CrudRepository;
import com.example.spring.mysql.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
