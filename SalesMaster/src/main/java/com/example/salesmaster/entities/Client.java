package com.example.salesmaster.entities;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client {
    private Long clientID;
    private String nom;
    private String adresse;
    private String email;
    private String telephone;
    private List<Vente> historiqueAchats;
    @Getter
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    // Getters and setters
}
