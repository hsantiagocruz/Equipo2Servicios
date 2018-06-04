package edu.utm.service.cliente;

import java.util.List;

import edu.utm.bd.domain.Cliente;

public interface ClienteService {
	List <Cliente> findAllClientes();
	void updateCliente(Cliente cliente);
	void insertCliente(Cliente cliente);
	void deleteOneCliente(Cliente cliente);
}
