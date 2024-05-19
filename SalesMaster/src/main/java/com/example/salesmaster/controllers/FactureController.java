package com.example.salesmaster.controllers;

import com.example.salesmaster.entities.Facture;
import com.example.salesmaster.services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/factures")
public class FactureController {
    @Autowired
    private FactureService factureService;

    @GetMapping("/")
    public List<Facture> getAllFactures() {
        return factureService.getAllFactures();
    }

    @GetMapping("/{id}")
    public Facture getFactureById(@PathVariable Long id) {
        return factureService.getFactureById(id);
    }

    @PostMapping("/")
    public Facture createFacture(@RequestBody Facture facture) {
        return factureService.createFacture(facture);
    }

    @PutMapping("/{id}")
    public Facture updateFacture(@PathVariable Long id, @RequestBody Facture facture) {
        return factureService.updateFacture(id, facture);
    }

    @DeleteMapping("/{id}")
    public void deleteFacture(@PathVariable Long id) {
        factureService.deleteFacture(id);
    }

    @PostMapping("/{id}/generate")
    public void generateInvoice(@PathVariable Long id) {
        factureService.generateInvoice(id);
    }

    @PostMapping("/{id}/customize")
    public void customizeInvoice(@PathVariable Long id) {
        factureService.customizeInvoice(id);
    }

    @PostMapping("/{id}/send")
    public void sendInvoice(@PathVariable Long id) {
        factureService.sendInvoice(id);
    }
}
