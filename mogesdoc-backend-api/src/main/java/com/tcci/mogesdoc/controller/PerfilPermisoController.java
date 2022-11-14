package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.PerfilPermiso;
import com.tcci.mogesdoc.service.PerfilPermisoService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/perfilesPermisos")
public class PerfilPermisoController extends MogesdocControllerGeneric<PerfilPermiso, PerfilPermisoService>{

}
