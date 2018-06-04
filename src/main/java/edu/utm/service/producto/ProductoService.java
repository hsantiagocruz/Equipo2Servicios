package edu.utm.service.producto;

import java.util.List;
import edu.utm.bd.domain.Producto;

public interface ProductoService {
	List <Producto> findAllProductos();
	Producto findOneProducto(Producto producto);
	void insertProducto(Producto producto);
	void updateProducto(Producto producto);
	void deleteProducto(Producto producto);
}
