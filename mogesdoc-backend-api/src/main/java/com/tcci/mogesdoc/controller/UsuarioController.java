package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Usuario;
import com.tcci.mogesdoc.service.UsuarioService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/usuarios")
public class UsuarioController extends MogesdocControllerGeneric<Usuario, UsuarioService>{

}
