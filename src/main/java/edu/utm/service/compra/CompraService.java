package edu.utm.service.compra;

import java.util.List;

import edu.utm.bd.domain.Compra;

public interface CompraService {
	List <Compra> findAllCompras();
	Compra findOneCompra(Compra compra);
}
