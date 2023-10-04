package com.facu.restfake.RestfakeApplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facu.restfake.RestfakeApplication.entities.persona;
import com.facu.restfake.RestfakeApplication.services.PersonaServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/personas")
public class PersonaController extends BaseControllerImpl<persona, PersonaServiceImpl>{

    @Override
    public ResponseEntity<?> get0ne(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get0ne'");
    }

    @Override
    public ResponseEntity<?> save(persona entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
   
    
}