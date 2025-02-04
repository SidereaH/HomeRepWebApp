package ru.homerep.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.homerep.models.City;

public interface CityRepository extends CrudRepository<City, Long> {
    City findByName(String name);
}
