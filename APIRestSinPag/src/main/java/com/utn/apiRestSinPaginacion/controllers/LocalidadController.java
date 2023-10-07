package com.utn.apiRestSinPaginacion.controllers;

import com.utn.apiRestSinPaginacion.entities.Localidad;
import com.utn.apiRestSinPaginacion.services.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
