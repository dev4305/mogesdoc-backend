package com.tcci.mogesdoc.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "BITACORA_DOCUMENTO")
public class BitacoraDocumento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9201739048546068000L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "USUARIO")
	private Integer usuario;
	
	@Column(name = "DOCUMENTO")
	private Integer documento;
	
	@Column(name = "FECHA_REGISTRO", updatable = false)
	private LocalDateTime fechaRegistro;
	
	@Column(name = "TIPO_ACCION")
	private Integer tipoAccion;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
}
