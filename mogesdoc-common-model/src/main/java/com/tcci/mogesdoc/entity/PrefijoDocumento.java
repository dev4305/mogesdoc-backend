package com.tcci.mogesdoc.entity;

import java.io.Serializable;

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
@Table(name = "PREFIJO_DOCUMENTO")
public class PrefijoDocumento implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4787875955609246890L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "AREA")
	private String area;
	
	@Column(name = "UNIDAD")
	private String unidad;
	
	@Column(name = "AGENCIA")
	private String agencia;
	
	@Column(name = "TIPO_PREFIJO")
	private Integer tipoPrefijo;
	
}
