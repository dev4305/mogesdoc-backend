package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Departamento;
import com.tcci.mogesdoc.service.DepartamentoService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/departamentos")
public class DepartamentoController extends MogesdocControllerGeneric<Departamento, DepartamentoService>{

}
