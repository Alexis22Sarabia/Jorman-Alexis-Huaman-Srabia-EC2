package com.idat.EC1JormanHuaman.dto;

public class ProductoDTORequest {
	private Integer id;
	private String nombreproducto;
	private String descripcionProducto;
	private Double precioProducto;
	private Integer stockProducto;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombreproducto;
	}
	public void setNombre(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public Double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public Integer getStockProducto() {
		return stockProducto;
	}
	public void setStockProducto(Integer stockProducto) {
		this.stockProducto = stockProducto;
	}
	
}
