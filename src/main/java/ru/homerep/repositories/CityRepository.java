package ru.homerep.repositories;

import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<CityRepository, Long> {
    CityRepository findByName(String name);
}
