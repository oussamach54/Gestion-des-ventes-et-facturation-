package com.example.salesmaster.controllers;

import com.example.salesmaster.entities.Produit;
import com.example.salesmaster.services.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/produits")
public class ProduitController {

    private ProduitService produitService;

    @PostMapping()
    public String add(@RequestBody Produit produit) {
        produitService.saveProduit(produit);
        return "New product is added";
    }

    @GetMapping
    public List<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }

    @GetMapping("/get/{id}")
    public Optional<Produit> getProduitById(@PathVariable Long id) {
        return produitService.getProduitById(id);
    }

    @PutMapping("/update/{id}")
    public Produit updateProduit(@PathVariable Long id, @RequestBody Produit updatedProduit) {
        return produitService.updateProduit(id, updatedProduit);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduit(@PathVariable Long id) {
        produitService.deleteProduitById(id);
        return "Produit deleted successfully";
    }
}


