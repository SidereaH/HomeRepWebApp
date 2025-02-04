package ru.homerep.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.homerep.models.Category;
import ru.homerep.models.Client;

import java.util.List;

public interface Clientrepository extends CrudRepository<Client, Long> {
    Client findClientByName(String name);
    Client findClientById(Long id);
    Client findClientByEmail(String email);
    List<Client> findClientsByCategory(Category category);
}
