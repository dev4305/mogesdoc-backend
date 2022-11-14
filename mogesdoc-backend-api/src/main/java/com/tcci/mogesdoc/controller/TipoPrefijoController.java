package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.TipoPrefijo;
import com.tcci.mogesdoc.service.TipoPrefijoService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1.0/tiposPrefijo")
public class TipoPrefijoController extends MogesdocControllerGeneric<TipoPrefijo, TipoPrefijoService>{

}
