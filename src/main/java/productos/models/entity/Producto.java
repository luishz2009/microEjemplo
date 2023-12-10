package com.microservicios.productos.models.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "productos")
@Setter
@Getter
public class Producto implements Serializable {
	
	/**
	 * Serializable es para convertir nuestro objeto en bits 
	 * y guardarlo en un archivo de texto
	 * Creamos un serialVersion que tiene que ser único
	 * (click derecho en la clase después de implementar)
	 */
	private static final long serialVersionUID = -6979673492492047362L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	private Double precio;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	

}
