package com.example.salesmaster.controllers;

import com.example.salesmaster.entities.Vente;
import com.example.salesmaster.services.VenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/ventes")
public class VenteController {
    @Autowired
    private VenteService venteService;

    @PostMapping()
    public String add(@RequestBody Vente vente){
        venteService.saveVente(vente);
        return "New vente added";
    }

    @GetMapping()
    public List<Vente> getAllVentes() {
        return venteService.getAllVentes();
    }

    @GetMapping("/get/{id}")
    public Vente getVenteById(@PathVariable Long id) {
        return venteService.getVenteById(id);
    }

    @PutMapping("/update/{id}")
    public Vente update(@PathVariable Long id, @RequestBody Vente updatedVente) {
        return venteService.updateVente(id, updatedVente);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        venteService.deleteVenteById(id);
        return "Vente deleted successfully";
    }
}
