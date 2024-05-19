package com.example.salesmaster.repositories;


import com.example.salesmaster.entities.Vente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenteRepository extends JpaRepository<Vente, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
