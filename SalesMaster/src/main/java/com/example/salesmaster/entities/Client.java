package com.example.salesmaster.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
@Entity
public class Client {

    // Getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientID;

    private String nom;
    private String adresse;
    private String email;
    private String telephone;
    private String HistoriqueAchats;

    @ManyToOne
    private Utilisateur utilisateur;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Vente> ventes = new ArrayList<>();
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


}
