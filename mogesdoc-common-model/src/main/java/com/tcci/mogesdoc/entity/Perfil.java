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
@Table(name = "PERFIL")
public class Perfil implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3465475309236592164L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "ESTADO")
	private String estado;
	
	@Column(name = "FECHA_CREACION", updatable = false)
	private LocalDateTime fechaCreacion;

	@PrePersist
	void prePersist() {
		fechaCreacion = LocalDateTime.now();
	}
	
}
