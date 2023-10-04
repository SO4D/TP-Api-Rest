package com.facu.restfake.RestfakeApplication.services;

import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.tokens.Token.ID;

import com.facu.restfake.RestfakeApplication.entities.persona;

@Service
public interface PersonaService extends BaseService <persona, ID>{
    
}
