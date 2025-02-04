package ru.homerep.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.homerep.models.Category;
import ru.homerep.models.Client;

import java.util.List;

public interface ClientRepository extends CrudRepository<Client, Long> {
    Client findClientByFirstNameAndLastName(String firstName, String lastName);
    Client findClientById(Long id);
    Client findClientByEmail(String email);

}
