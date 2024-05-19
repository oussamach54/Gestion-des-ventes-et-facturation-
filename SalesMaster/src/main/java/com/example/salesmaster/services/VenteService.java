package com.example.salesmaster.services;

import com.example.salesmaster.entities.Vente;

import java.util.List;

public interface VenteService {
    List<Vente> getAllVentes();
    Vente createVente(Vente vente);
    Vente updateVente(Long id, Vente updatedVente);
    void deleteVenteById(Long id);
    Vente getVenteById(Long id);

    void saveVente(Vente vente);
}
