package edu.utm.service.cliente;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import edu.utm.bd.domain.Cliente;
import edu.utm.dao.cliente.ClienteDao;

@Named
public class ClienteServiceImpl implements ClienteService{
	
	@Inject
	ClienteDao clienteDao;
	
	@Override
	public List<Cliente> findAllClientes() {
		return clienteDao.findAllClientes();
	}

	@Override
	public void updateCliente(Cliente cliente) {
		clienteDao.updateCliente(cliente);
	}
	
	public void insertCliente(Cliente cliente){
		clienteDao.insertCliente(cliente);
	}

	public void deleteOneCliente(Cliente cliente){
		clienteDao.deleteOneCliente(cliente);
	}
}
