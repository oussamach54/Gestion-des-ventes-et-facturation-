package com.example.salesmaster.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@Data
public class Vente {
    @Id
    @GeneratedValue
    private Long VenteID;
    private Date DateVente;
    private String Statut;
    private Double Total;

    @ManyToOne
    private Client client;

    @OneToOne
    @JoinColumn(name = "facture_id")
    private Facture facture;

    @OneToMany(mappedBy = "vente", fetch = FetchType.LAZY)
    List<LigneDeVente> ligneDeVentes = new ArrayList<>();

    @ManyToOne
    private Utilisateur utilisateur;
}