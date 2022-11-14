package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Correspondencia;
import com.tcci.mogesdoc.service.CorrespondenciaService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/correspondencias")
public class CorrespondenciaController extends MogesdocControllerGeneric<Correspondencia, CorrespondenciaService> {

}
