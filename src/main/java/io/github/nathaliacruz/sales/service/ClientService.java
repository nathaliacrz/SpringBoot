/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.nathaliacruz.sales.service;

import io.github.nathaliacruz.sales.model.Client;
import io.github.nathaliacruz.sales.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author nath0
 */
@Service
public class ClientService {

    private ClientRepository repository;

    @Autowired
    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public void saveClient(Client client) {
        validationClient(client);
        repository.persist(client);
    }

    public void validationClient(Client client) {

    }
}
