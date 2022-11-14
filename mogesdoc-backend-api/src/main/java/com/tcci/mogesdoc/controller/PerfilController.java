package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Perfil;
import com.tcci.mogesdoc.service.PerfilService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/perfiles")
public class PerfilController extends MogesdocControllerGeneric<Perfil, PerfilService>{

}
