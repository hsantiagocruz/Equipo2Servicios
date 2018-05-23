package edu.utm.service.venta;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import edu.utm.bd.domain.Venta;
import edu.utm.dao.venta.VentaDao;

@Named
public class VentaServiceImpl implements VentaService{
	@Inject
	VentaDao ventaDao;
	
	@Override
	public List<Venta> findAllVentas() {
		return ventaDao.findAllVentas();
	}

	@Override
	public Venta findOneVenta(Venta venta) {
		return ventaDao.findOneVenta(venta);
	}

	@Override
	public void insertVenta(Venta venta) {
		
	}

}
