package com.alkemy.disney.repositories;

import com.alkemy.disney.models.PeliculaSerie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface PeliculaSerieRepository extends JpaRepository<PeliculaSerie, Long> {
    PeliculaSerie getById(Long id);
}
