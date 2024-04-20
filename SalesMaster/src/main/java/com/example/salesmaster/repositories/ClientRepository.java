package com.example.salesmaster.repositories;


import org.springframework.boot.autoconfigure.integration.IntegrationProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClientRepository extends JpaRepository<IntegrationProperties.RSocket.Client, Long> {
}

