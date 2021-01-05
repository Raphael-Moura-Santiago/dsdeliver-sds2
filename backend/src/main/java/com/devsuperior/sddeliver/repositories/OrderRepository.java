package com.devsuperior.sddeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.sddeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
