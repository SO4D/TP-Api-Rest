package com.facu.restfake.RestfakeApplication.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facu.restfake.RestfakeApplication.entities.Localidad;
import com.facu.restfake.RestfakeApplication.services.LocalidadServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{
}
