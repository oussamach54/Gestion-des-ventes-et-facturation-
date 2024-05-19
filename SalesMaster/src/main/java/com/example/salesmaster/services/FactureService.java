package com.example.salesmaster.services;

import com.example.salesmaster.entities.Facture;

import java.util.List;

public interface FactureService {
    List<Facture> getAllFactures();
    Facture getFactureById(Long id);
    Facture createFacture(Facture facture);
    Facture updateFacture(Long id, Facture facture);
    void deleteFacture(Long id);
    void generateInvoice(Long id);
    void customizeInvoice(Long id);
    void sendInvoice(Long id);
}
