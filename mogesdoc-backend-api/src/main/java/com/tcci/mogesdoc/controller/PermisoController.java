package com.tcci.mogesdoc.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcci.mogesdoc.entity.Permiso;
import com.tcci.mogesdoc.service.PermisoService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("/v1.0/permisos")
public class PermisoController extends MogesdocControllerGeneric<Permiso, PermisoService>{

}
