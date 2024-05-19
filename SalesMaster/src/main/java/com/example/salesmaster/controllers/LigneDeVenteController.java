package com.example.salesmaster.controllers;

import com.example.salesmaster.entities.LigneDeVente;
import com.example.salesmaster.services.LigneDeVenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lignesvente")
public class LigneDeVenteController {
    @Autowired
    private LigneDeVenteService ligneDeVenteService;

    @GetMapping("/")
    public List<LigneDeVente> getAllLignesDeVente() {
        return ligneDeVenteService.getAllLignesDeVente();
    }

    @GetMapping("/{id}")
    public LigneDeVente getLigneDeVenteById(@PathVariable Long id) {
        return ligneDeVenteService.getLigneDeVenteById(id);
    }

    @PostMapping("/")
    public LigneDeVente createLigneDeVente(@RequestBody LigneDeVente ligneDeVente) {
        return ligneDeVenteService.createLigneDeVente(ligneDeVente);
    }

    // Autres méthodes pour mettre à jour et supprimer une ligne de vente

}
