package com.idat.EC1JormanHuaman.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC1JormanHuaman.dto.ProductoDTORequest;
import com.idat.EC1JormanHuaman.dto.ProductoDTOResponse;
import com.idat.EC1JormanHuaman.model.Productos;
import com.idat.EC1JormanHuaman.repository.ProductoRepository;

@Service

public class ProductoServiceImpl implements ProductoService {

	@Autowired
private ProductoRepository repository;

	@Override
	public void guardarProducto(ProductoDTORequest producto) {
		
		Productos p= new Productos();
		p.setProducto(producto.getNombre());
		p.setDescripcion(p.getDescripcion());
		p.setPrecio(producto.getPrecioProducto());
		p.setStock(producto.getStockProducto());
		
		// TODO Auto-generated method stub
		repository.save(p);
		

	}

	@Override
	public void actualizarProducto(ProductoDTORequest producto) {
		Productos p= new Productos();
		p.setIdProducto(producto.getId());
		p.setProducto(producto.getNombre());
		p.setDescripcion(p.getDescripcion());
		p.setPrecio(producto.getPrecioProducto());
		p.setStock(producto.getStockProducto());
		
		
		// TODO Auto-generated method stub
		repository.saveAndFlush(p);

	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);

	}

	@Override
	public List<ProductoDTOResponse> listarProductos()
	{
		List<ProductoDTOResponse> listar = new ArrayList<>();
		ProductoDTOResponse dto = null;
		List<Productos> p =  repository.findAll();
		// TODO Auto-generated method stub
		for (Productos productos : p) {
			
			dto = new ProductoDTOResponse();
			dto.setDescripcionProducto(productos.getDescripcion());
			dto.setNombre(productos.getProducto());
			dto.setPrecioProducto(productos.getPrecio());
			dto.setStockProducto(productos.getStock());
			dto.setId(productos.getIdProducto());
			
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public ProductoDTOResponse obtenerProductoId(Integer id) {
		
		Productos productos =   repository.findById(id).orElse(null);
		ProductoDTOResponse dto = new ProductoDTOResponse();

		dto.setDescripcionProducto(productos.getDescripcion());
		dto.setNombre(productos.getProducto());
		dto.setPrecioProducto(productos.getPrecio());
		dto.setStockProducto(productos.getStock());
		dto.setId(productos.getIdProducto());
		
		
		// TODO Auto-generated method stub
		return dto;
	}

}
