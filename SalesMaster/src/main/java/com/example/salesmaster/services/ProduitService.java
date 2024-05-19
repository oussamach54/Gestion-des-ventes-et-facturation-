package com.example.salesmaster.services;

import com.example.salesmaster.entities.Produit;
import com.example.salesmaster.repositories.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProduitService {


    private ProduitRepository produitRepository;

    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    public Produit saveProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    public Optional<Produit> getProduitById(Long id) {
        return produitRepository.findById(id);
    }

    public Produit updateProduit(Long id, Produit updatedProduit) {
        Optional<Produit> existingProduit = produitRepository.findById(id);
        if (existingProduit.isPresent()) {
            Produit produitToUpdate = existingProduit.get();
            produitToUpdate.setNom(updatedProduit.getNom());
            produitToUpdate.setDescription(updatedProduit.getDescription());
            produitToUpdate.setPrix(updatedProduit.getPrix());
            produitToUpdate.setQuantiteEnStock(updatedProduit.getQuantiteEnStock());
            produitToUpdate.setImage(updatedProduit.getImage());
            produitToUpdate.setUtilisateur(updatedProduit.getUtilisateur()); // Assuming Utilisateur relationship is managed here
            produitRepository.save(produitToUpdate);
            return produitToUpdate;
        } else {
            throw new RuntimeException("Produit not found with id: " + id);
        }
    }

    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);
    }
}
