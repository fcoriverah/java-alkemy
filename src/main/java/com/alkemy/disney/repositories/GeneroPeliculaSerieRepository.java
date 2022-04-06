package com.alkemy.disney.repositories;

import com.alkemy.disney.models.GeneroPeliculaSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface GeneroPeliculaSerieRepository extends JpaRepository<GeneroPeliculaSerie, Long> {
}