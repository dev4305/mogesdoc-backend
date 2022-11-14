package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Pais;
import com.tcci.mogesdoc.service.PaisService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/paises")
public class PaisController extends MogesdocControllerGeneric<Pais, PaisService>{

}
