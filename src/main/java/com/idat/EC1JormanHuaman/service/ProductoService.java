package com.idat.EC1JormanHuaman.service;

import java.util.List;

import com.idat.EC1JormanHuaman.dto.ProductoDTORequest;
import com.idat.EC1JormanHuaman.dto.ProductoDTOResponse;

public interface ProductoService {

	void guardarProducto(ProductoDTORequest producto);
	void actualizarProducto(ProductoDTORequest producto);
	void eliminarProducto(Integer id);
	List<ProductoDTOResponse> listarProductos();
	ProductoDTOResponse obtenerProductoId(Integer id);
}
