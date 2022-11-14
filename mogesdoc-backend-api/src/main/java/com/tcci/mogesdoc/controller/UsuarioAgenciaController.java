package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.UsuarioAgencia;
import com.tcci.mogesdoc.service.UsuarioAgenciaService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/usuariosAgencia")
public class UsuarioAgenciaController extends MogesdocControllerGeneric<UsuarioAgencia, UsuarioAgenciaService>{

}
