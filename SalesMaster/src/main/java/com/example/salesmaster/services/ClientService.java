package com.example.salesmaster.services;

import com.example.salesmaster.entities.Client;
import com.example.salesmaster.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(Client client) {
        return clientRepository.save(client);
    }

    public Client getClientById(Long id) {
        Optional<Client> clientOptional = clientRepository.findById(id);
        return clientOptional.orElse(null);
    }
    public Client updateClient(Long id, Client client) {
        if (clientRepository.existsById(id)) {
            client.setClientID(id);
            return clientRepository.save(client);
        }
        return null;
    }
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    // Add other methods for update as needed
}
