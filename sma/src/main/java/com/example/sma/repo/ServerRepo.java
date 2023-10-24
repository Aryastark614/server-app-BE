package com.example.sma.repo;

import com.example.sma.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}