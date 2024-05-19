package com.example.salesmaster.repositories;


import com.example.salesmaster.entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
