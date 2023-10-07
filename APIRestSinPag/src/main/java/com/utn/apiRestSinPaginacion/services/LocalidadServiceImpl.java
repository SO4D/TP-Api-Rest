package com.utn.apiRestSinPaginacion.services;

import com.utn.apiRestSinPaginacion.entities.Localidad;
import com.utn.apiRestSinPaginacion.repositories.AutorRepository;
import com.utn.apiRestSinPaginacion.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

    @Autowired
    private AutorRepository autorRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }

}
