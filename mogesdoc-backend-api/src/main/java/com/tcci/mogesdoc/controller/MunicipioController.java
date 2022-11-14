package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Municipio;
import com.tcci.mogesdoc.service.MunicipioService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/municipios")
public class MunicipioController extends MogesdocControllerGeneric<Municipio, MunicipioService> {

}
