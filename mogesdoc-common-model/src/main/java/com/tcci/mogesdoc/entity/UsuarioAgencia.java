package com.tcci.mogesdoc.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "USUARIO_AGENCIA")
public class UsuarioAgencia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2303416235267510186L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "USUARIO")
	private Integer usuario;
	
	@Column(name = "AGENCIA")
	private Integer agencia;
	
	@Column(name = "ESTADO")
	private String estado;
	
	@Column(name = "FECHA_CREACION", updatable = false)
	private LocalDateTime fechaCreacion;
	
	@Column(name = "FECHA_MODIFICACION")
	private LocalDateTime fechaModificacion;
	
	@PrePersist
	void prePersist() {
		fechaCreacion = LocalDateTime.now();
	}
	
}
