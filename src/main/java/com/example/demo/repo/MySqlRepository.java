package com.example.demo.repo;

import com.example.demo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlRepository extends JpaRepository<Address,Integer> {
}