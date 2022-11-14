package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.TipoCorrespondencia;
import com.tcci.mogesdoc.service.TipoCorrespondenciaService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/tiposCorrespondencia")
public class TipoCorrespondenciaController extends MogesdocControllerGeneric<TipoCorrespondencia, TipoCorrespondenciaService>{

}
