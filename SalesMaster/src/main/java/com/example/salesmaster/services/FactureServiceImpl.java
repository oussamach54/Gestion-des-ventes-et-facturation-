package com.example.salesmaster.services;

import com.example.salesmaster.entities.Facture;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class FactureServiceImpl implements FactureService {

    private final List<Facture> factures = new ArrayList<>();

    @Override
    public List<Facture> getAllFactures() {
        return factures;
    }

    @Override
    public Facture getFactureById(Long id) {
        return factures.stream()
                .filter(facture -> facture.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Facture createFacture(Facture facture) {
        factures.add(facture);
        return facture;
    }

    @Override
    public Facture updateFacture(Long id, Facture facture) {
        Facture existingFacture = getFactureById(id);
        if (existingFacture != null) {
            existingFacture.setDate(facture.getDate());
            existingFacture.setMontantTotal(facture.getMontantTotal());
            existingFacture.setPdf(facture.getPdf());
            existingFacture.setVente(facture.getVente());
            return existingFacture;
        }
        return null;
    }

    @Override
    public void deleteFacture(Long id) {
        factures.removeIf(facture -> facture.getId().equals(id));
    }

    @Override
    public void generateInvoice(Long id) {
        Facture facture = getFactureById(id);
        // Implement logic to generate invoice based on facture details
    }

    @Override
    public void customizeInvoice(Long id) {
        Facture facture = getFactureById(id);
        // Implement logic to customize invoice based on facture details
    }

    @Override
    public void sendInvoice(Long id) {
        Facture facture = getFactureById(id);
        // Implement logic to send invoice to client via email
    }
}
