package com.example.salesmaster.services;

import com.example.salesmaster.entities.LigneDeVente;
import com.example.salesmaster.repositories.LigneDeVenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneDeVenteServiceImpl implements LigneDeVenteService {
    @Autowired
    private LigneDeVenteRepository ligneDeVenteRepository;

    @Override
    public List<LigneDeVente> getAllLignesDeVente() {
        return ligneDeVenteRepository.findAll();
    }

    @Override
    public LigneDeVente getLigneDeVenteById(Long id) {
        return ligneDeVenteRepository.findById(id).orElse(null);
    }

    @Override
    public LigneDeVente createLigneDeVente(LigneDeVente ligneDeVente) {
        return ligneDeVenteRepository.save(ligneDeVente);
    }

    // Autres méthodes pour mettre à jour et supprimer une ligne de vente
}
