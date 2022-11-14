package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Agencia;
import com.tcci.mogesdoc.service.AgenciaService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/agencias")
public class AgenciaController extends MogesdocControllerGeneric<Agencia, AgenciaService>{

}
