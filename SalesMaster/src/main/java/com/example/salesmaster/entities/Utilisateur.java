package com.example.salesmaster.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.Data;

import java.util.*;

@Entity
@Data
public class Utilisateur {
    @Id
    @GeneratedValue
    private Long UtilisateurID;
    private String Nom;
    private String Email;
    private String MotDePasse;
    private String Role;

    @ManyToOne
    private Produit produit;
    @OneToMany(mappedBy = "utilisateur",fetch = FetchType.LAZY)
    private List<Vente> ventes = new ArrayList<>();

    @OneToMany(mappedBy = "utilisateur")
    private List<Produit> produits = new ArrayList<>();

    @OneToMany(mappedBy = "utilisateur", fetch = FetchType.LAZY)
    private List<Client> clients;


}
