package com.alkemy.disney.repositories;

import com.alkemy.disney.models.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GeneroRepository extends JpaRepository<Genero, Long> {
    Genero findGeneroByNombre(String nombre);
}
