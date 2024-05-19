package com.example.salesmaster.services;



import com.example.salesmaster.entities.Client;
import com.example.salesmaster.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client updateClient(Long id, Client updatedClient) {
        Client existingClient = getClientById(id);
        if (existingClient != null) {
            // Update the existing client with the new values from updatedClient
            // Make sure to handle all fields that can be updated
            existingClient.setNom(updatedClient.getNom());
            existingClient.setAdresse(updatedClient.getAdresse());
            existingClient.setEmail(updatedClient.getEmail());
            existingClient.setTelephone(updatedClient.getTelephone());
            existingClient.setHistoriqueAchats(updatedClient.getHistoriqueAchats());
            return clientRepository.save(existingClient);
        }
        return null;
    }

    @Override
    public void deleteClientById(Long id) {
        Client existingClient = getClientById(id);
        if (existingClient != null) {
            clientRepository.delete(existingClient);
        }
    }

    @Override
    public void deleteAllClient() {
        clientRepository.deleteAll();
    }
}
