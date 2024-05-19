package com.example.salesmaster.entities;




import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Entity
@Data
public class Produit {
    @Id
    @GeneratedValue
    private Long ProduitID;
    private String Nom;
    private String Description;
    private Double Prix;
    private int QuantiteEnStock;
    private String Image;
    @OneToMany(mappedBy = "produit", fetch = FetchType.LAZY)
    List<LigneDeVente> ligneDeVentes = new ArrayList<>();
    @ManyToOne
    private Utilisateur utilisateur;
}