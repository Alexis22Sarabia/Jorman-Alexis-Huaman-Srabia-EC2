package com.idat.EC1JormanHuaman.model;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "Productos")
@Entity
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	private Integer idProducto;
	private String producto;
	private String descripcion;
	private Double precio;
	private Integer stock;	
	
	@ManyToMany
	@JoinTable(
			name= "productos_cliente",
			joinColumns = @JoinColumn(
					name = "id_producto" ,
					nullable=false, 
					unique=true, 
					foreignKey = @ForeignKey(foreignKeyDefinition =
					"foreign key (id_producto) references Productos(id_producto)")
					),
			inverseJoinColumns = @JoinColumn(
					name = "id_cliente" ,
					nullable=false, 
					unique=true, 
					foreignKey = @ForeignKey(foreignKeyDefinition =
					"foreign key (id_cliente) references Cliente(id_cliente)")
					)
			
			)
	
	
	private List<Cliente> cliente = new ArrayList<>();
	
	
	
	@OneToMany(mappedBy = "producto")
	private List<Bodega> bodega = new ArrayList<>();
		
	public Integer getIdProducto() {
		
	return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	
}
