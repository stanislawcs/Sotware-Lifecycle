package com.example.db.databases;

import com.example.db.databases.dao.ClientDao;
import com.example.db.databases.entities.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientDao clientDao;

    @GetMapping
    public void getAllClients() {
        for(Client client : clientDao.getAllClients()) {
            System.out.println(client);
        }
    }
}
