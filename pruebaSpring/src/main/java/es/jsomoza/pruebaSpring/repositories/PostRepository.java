package es.jsomoza.pruebaSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jsomoza.pruebaSpring.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
