package com.utn.apiRestSinPaginacion.controllers;

import com.utn.apiRestSinPaginacion.entities.Persona;
import com.utn.apiRestSinPaginacion.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona, PersonaServiceImpl>{




}
