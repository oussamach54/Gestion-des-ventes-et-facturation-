package com.example.salesmaster.services;

import com.example.salesmaster.entities.Vente;
import com.example.salesmaster.repositories.VenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VenteServiceImpl implements VenteService {

    @Autowired
    private VenteRepository venteRepository;

    @Override
    public List<Vente> getAllVentes() {
        return venteRepository.findAll();
    }

    @Override
    public Vente createVente(Vente vente) {
        return venteRepository.save(vente);
    }

    @Override
    public Vente updateVente(Long id, Vente updatedVente) {
        Vente existingVente = venteRepository.findById(id).orElse(null);
        if (existingVente != null) {
            existingVente.setDateVente(updatedVente.getDateVente());
            existingVente.setStatut(updatedVente.getStatut());
            existingVente.setTotal(updatedVente.getTotal());
            existingVente.setFacture(updatedVente.getFacture());
            // Set other fields as needed
            return venteRepository.save(existingVente);
        }
        return null;
    }

    @Override
    public void deleteVenteById(Long id) {
        venteRepository.deleteById(id);
    }

    @Override
    public Vente getVenteById(Long id) {
        return venteRepository.findById(id).orElse(null);
    }

    @Override
    public void saveVente(Vente vente) {

    }
}
