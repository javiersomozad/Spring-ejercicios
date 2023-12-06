package es.jsomoza.rest.service;

import es.jsomoza.rest.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerService {

    List<Maker> findAll();
    
    List<Maker> findByName(String name);

    Optional<Maker> findById(Long id);

    void save(Maker maker);

    void deleteById(Long id);
}
