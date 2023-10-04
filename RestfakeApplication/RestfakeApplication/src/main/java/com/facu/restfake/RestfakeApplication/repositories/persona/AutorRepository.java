package com.facu.restfake.RestfakeApplication.repositories.persona;

import org.springframework.stereotype.Repository;

import com.facu.restfake.RestfakeApplication.entities.Autor;

@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {
    
}
