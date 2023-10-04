package com.facu.restfake.RestfakeApplication.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facu.restfake.RestfakeApplication.entities.persona;
import com.facu.restfake.RestfakeApplication.repositories.persona.BaseRepository;
import com.facu.restfake.RestfakeApplication.repositories.persona.PersonaRepository;

@Service
 public class PersonaServiceImpl extends BaseServiceImpl<persona, Long> implements PersonaService{
    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }
}
