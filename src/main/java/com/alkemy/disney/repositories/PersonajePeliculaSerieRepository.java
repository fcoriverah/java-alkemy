package com.alkemy.disney.repositories;

import com.alkemy.disney.models.PersonajePeliculaSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonajePeliculaSerieRepository extends JpaRepository<PersonajePeliculaSerie, Long> {
}
