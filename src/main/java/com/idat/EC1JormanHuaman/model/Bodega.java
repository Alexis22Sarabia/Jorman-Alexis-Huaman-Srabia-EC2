package com.idat.EC1JormanHuaman.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Bodega")
public class Bodega {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBodega;
	private String nombre;
	private String Bodegadireccion;
	
	@ManyToOne
	@JoinColumn(
			name = "id_producto" ,
			nullable=false, 
			unique=true, 
			foreignKey = @ForeignKey(foreignKeyDefinition =
			"foreign key (id_producto) references Productos(id_producto)")
			)
	
	
	
	
	
	public Integer getIdBodega() {
		return idBodega;
	}
	public void setIdBodega(Integer idBodega) {
		this.idBodega = idBodega;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getBodegadireccion() {
		return Bodegadireccion;
	}
	public void setBodegadireccion(String bodegadireccion) {
		Bodegadireccion = bodegadireccion;
	}
	
	
}
