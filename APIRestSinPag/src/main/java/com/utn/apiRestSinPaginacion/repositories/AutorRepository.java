package com.utn.apiRestSinPaginacion.repositories;

import com.utn.apiRestSinPaginacion.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long> {
}
