package com.devsuperior.sddeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.sddeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	List<Product> findAllByOrderByNameAsc();
}
