package edu.utm.service.venta;

import java.util.List;

import edu.utm.bd.domain.Venta;

public interface VentaService {
	List <Venta>findAllVentas();
	Venta findOneVenta(Venta venta);
	void insertVenta(Venta venta);
}
