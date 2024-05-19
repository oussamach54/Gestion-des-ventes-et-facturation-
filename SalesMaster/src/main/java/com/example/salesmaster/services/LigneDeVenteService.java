package com.example.salesmaster.services;

import com.example.salesmaster.entities.LigneDeVente;
import java.util.List;

public interface LigneDeVenteService {
    List<LigneDeVente> getAllLignesDeVente();
    LigneDeVente getLigneDeVenteById(Long id);
    LigneDeVente createLigneDeVente(LigneDeVente ligneDeVente);
    // Autres méthodes pour mettre à jour et supprimer une ligne de vente
}
