package com.facu.restfake.RestfakeApplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facu.restfake.RestfakeApplication.entities.Autor;
import com.facu.restfake.RestfakeApplication.services.AutorServiceImpl;

@RestController
@CrossOrigin (origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{

    @Override
    public ResponseEntity<?> get0ne(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'get0ne'");
    }

    @Override
    public ResponseEntity<?> save(Autor entity) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
    
}
