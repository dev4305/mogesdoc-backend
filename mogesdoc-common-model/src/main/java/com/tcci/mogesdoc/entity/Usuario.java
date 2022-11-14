package com.tcci.mogesdoc.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "USUARIO")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7549591948629715408L;

	@Id
	@Column(name = "USUARIO")
	private Long usuario;
	
	@Column(name = "CLAVE")
	private String clave;
	
	@Column(name = "ESTADO")
	private String estado;
	
	@Column(name = "FECHA_CREACION", updatable = false)
	private LocalDateTime fechaCreacion;
	
	@Column(name = "OBSERVACION")
	private String observacion;
	
	@Column(name = "TIPO_USUARIO")
	private Integer tipoUsuario;
	
	@Column(name = "PERFIL")
	private Integer perfil;

	@PrePersist
	void prePersist() {
		fechaCreacion = LocalDateTime.now();
	}
	
}
