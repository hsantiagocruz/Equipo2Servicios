package edu.utm.service.factura;

import java.util.List;
import edu.utm.bd.domain.Factura;

public interface FacturaService {
	List <Factura> findAllFacturas();
	Factura findOneFactura(Factura factura);
	Factura findOneFacturaxFecha(Factura factura);
}
