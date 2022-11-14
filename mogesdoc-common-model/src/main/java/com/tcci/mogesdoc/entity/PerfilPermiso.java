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
@Table(name = "PERFIL_PERMISO")
public class PerfilPermiso implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4509273029141879338L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "PERFIL")
	private Integer perfil;
	
	@Column(name = "PERMISO")
	private Integer permiso;
	
}
