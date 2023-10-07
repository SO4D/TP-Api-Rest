package com.utn.apiRestSinPaginacion.services;


import com.utn.apiRestSinPaginacion.entities.Persona;
import com.utn.apiRestSinPaginacion.repositories.BaseRepository;
import com.utn.apiRestSinPaginacion.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
    }

}

