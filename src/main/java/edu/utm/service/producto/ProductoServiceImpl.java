package edu.utm.service.producto;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import edu.utm.bd.domain.Producto;
import edu.utm.dao.producto.ProductoDao;

@Named
public class ProductoServiceImpl implements ProductoService{
	@Inject
	ProductoDao productoDao;
	
	@Override
	public List<Producto> findAllProductos() {
		return productoDao.findAllProductos();
	}
	
	@Override
	public Producto findOneProducto(Producto producto) {
		return productoDao.findOneProducto(producto);
	}
	
	public void insertProducto(Producto producto){
		productoDao.insertProducto(producto);
	}
	public void updateProducto(Producto producto){
		productoDao.updateProducto(producto);
	}
	public void deleteProducto(Producto producto){
		productoDao.deleteProducto(producto);
	}
}
