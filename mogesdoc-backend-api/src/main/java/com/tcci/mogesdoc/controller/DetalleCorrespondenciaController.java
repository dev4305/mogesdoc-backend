package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.DetalleCorrespondencia;
import com.tcci.mogesdoc.service.DetalleCorrespondenciaService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/detallesCorrespondencia")
public class DetalleCorrespondenciaController extends MogesdocControllerGeneric<DetalleCorrespondencia, DetalleCorrespondenciaService>{

}
