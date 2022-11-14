package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.TipoUsuario;
import com.tcci.mogesdoc.service.TipoUsuarioService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/tiposUsuario")
public class TipoUsuarioController extends MogesdocControllerGeneric<TipoUsuario, TipoUsuarioService>{

}
