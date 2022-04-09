package com.alkemy.disney.repositories;

import com.alkemy.disney.models.Personaje;
import com.alkemy.disney.projections.PersonajeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonajeRepository extends JpaRepository<Personaje, Long> {

    //@Query(value = "SELECT * FROM PERSONAJE WHERE nombre = :nombre", nativeQuery = true)
    PersonajeProjection findPersonajeByNombre(String nombre);
}
