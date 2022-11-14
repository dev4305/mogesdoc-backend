package com.tcci.mogesdoc.service.impl;

import org.springframework.stereotype.Service;

import com.tcci.mogesdoc.entity.Usuario;
import com.tcci.mogesdoc.repository.UsuarioRepository;
import com.tcci.mogesdoc.service.MogesdocServiceGenericImpl;
import com.tcci.mogesdoc.service.UsuarioService;

@Service
public class UsuarioServiceImpl extends MogesdocServiceGenericImpl<Usuario, UsuarioRepository> implements UsuarioService{

}
