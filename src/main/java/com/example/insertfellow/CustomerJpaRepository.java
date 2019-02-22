package com.example.insertfellow;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerJpaRepository extends JpaRepository<Customers, Long> {
    Customers findById(int id);
}
