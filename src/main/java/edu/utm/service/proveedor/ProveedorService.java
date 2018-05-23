package edu.utm.service.proveedor;

import java.util.List;

import edu.utm.bd.domain.Proveedor;

public interface ProveedorService {
	List<Proveedor> findAllProveedor();
	Proveedor findOneProveedor(Proveedor proveedor);
}
