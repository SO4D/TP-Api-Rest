package com.facu.restfake.RestfakeApplication.services;

import org.springframework.stereotype.Service;

import com.facu.restfake.RestfakeApplication.entities.Localidad;
import com.facu.restfake.RestfakeApplication.repositories.persona.BaseRepository;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
