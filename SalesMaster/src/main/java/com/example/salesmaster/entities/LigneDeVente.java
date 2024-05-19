package com.example.salesmaster.entities;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class LigneDeVente {
    @Id
    @GeneratedValue
    private Long LigneDeVenteID;
    private int Quantite;
    private Double PrixUnitaire;
    @ManyToOne
    private Vente vente;
    @ManyToOne
    private Produit produit;
}