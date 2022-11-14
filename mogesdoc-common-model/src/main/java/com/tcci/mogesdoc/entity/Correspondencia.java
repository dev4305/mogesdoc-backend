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
@Table(name = "CORRESPONDENCIA")
public class Correspondencia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4896103823727007412L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "FECHA_CREACION", updatable = false)
	private LocalDateTime fechaCreacion;
	
	@Column(name = "TIPO_CORRESPONDENCIA")
	private Integer tipoCorrespondencia;
	
	@Column(name = "DOCUMENTO")
	private Integer documento;
	
	@Column(name = "USUARIO_AGENCIA")
	private Integer usuarioAgencia;
	
	@Column(name = "PRIORIDAD")
	private Integer prioridad;
	
	@Column(name = "DESTINATARIO")
	private String destinatario;
	
	@Column(name = "REMITENTE")
	private String remitente;
	
	@Column(name = "TIPO_MENSAJERIA")
	private Integer tipoMensajeria;
	
	@Column(name = "ESTADO")
	private String estado;

	@PrePersist
	void prePersist() {
		fechaCreacion = LocalDateTime.now();
	}
}
