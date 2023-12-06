package es.jsomoza.rest.persistence;

import es.jsomoza.rest.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerDAO {

    List<Maker> findAll();
    
    List<Maker> findMakerByName(String name);

    Optional<Maker> findById(Long id);

    void save(Maker maker);

    void deleteById(Long id);
}
