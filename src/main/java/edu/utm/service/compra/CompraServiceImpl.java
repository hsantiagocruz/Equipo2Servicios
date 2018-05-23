package edu.utm.service.compra;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import edu.utm.bd.domain.Compra;
import edu.utm.dao.compra.CompraDao;

@Named
public class CompraServiceImpl implements CompraService{
	
	@Inject
	CompraDao compraDao;
	
	@Override
	public List<Compra> findAllCompras() {
		return compraDao.findAllCompras();
	}

	@Override
	public Compra findOneCompra(Compra compra) {
		return compraDao.findOneCompra(compra);
	}

}
