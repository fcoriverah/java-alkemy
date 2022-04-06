package com.alkemy.disney.repositories;

import com.alkemy.disney.models.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {
}
