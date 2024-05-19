package com.example.salesmaster.repositories;


import com.example.salesmaster.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
