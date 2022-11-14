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
@Table(name = "DOCUMENTO")
public class Documento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2175309285292195754L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "EXTENSION")
	private String extension;
	
	@Column(name = "FECHA_CREACION", updatable = false)
	private LocalDateTime fechaCreacion;
	
	@Column(name = "AUTOR")
	private String autor;
	
	@Column(name = "RUTA")
	private String ruta;
	
	@Column(name = "TIPO_DOCUMENTO")
	private Integer tipoDocumento;
	
	@Column(name = "PREFIJO")
	private Integer prefijo;

	@PrePersist
	void prePersist() {
		fechaCreacion = LocalDateTime.now();
	}
	
}
