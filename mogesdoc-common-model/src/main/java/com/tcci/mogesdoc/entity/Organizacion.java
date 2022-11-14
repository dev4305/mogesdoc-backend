package com.tcci.mogesdoc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "ORGANIZACION")
public class Organizacion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1921997333517770046L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "CODIGO")
	private String codigo;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "ESTADO")
	private String estado;
	
	@Column(name = "URL")
	private String url;
	
	@Column(name = "TELEFONO")
	private Integer telefono;
	
	@Column(name = "PREFIJO_TELEFONO")
	private Integer prefijoTelefono;
	
	@Lob
	@Column(name = "LOGOTIPO")
	private byte[] logotipo;
	
}
