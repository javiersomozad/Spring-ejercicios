package es.jsomoza.enums;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player, Long> {
	List<Player> findByName(String name);
    List<Player> findByPosition(Position position);
}
