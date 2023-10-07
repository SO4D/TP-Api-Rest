package com.utn.apiRestSinPaginacion.repositories;

import com.utn.apiRestSinPaginacion.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
