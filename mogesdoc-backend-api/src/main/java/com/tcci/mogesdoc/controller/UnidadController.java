package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Unidad;
import com.tcci.mogesdoc.service.UnidadService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/unidades")
public class UnidadController extends MogesdocControllerGeneric<Unidad, UnidadService>{

}
