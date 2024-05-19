package com.example.salesmaster.services;

import com.example.salesmaster.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClientService {
    public Client saveClient(Client client);

    public List<Client> getAllClient();
    Client getClientById(Long id);

    public Client updateClient(Long id, Client updatedClient);
    void deleteClientById(Long id);
    void deleteAllClient();


}
