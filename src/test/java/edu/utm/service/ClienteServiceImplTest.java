package edu.utm.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.utm.bd.domain.Cliente;
import edu.utm.service.cliente.ClienteService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ClienteServiceImplTest {
	@Inject
	ClienteService clienteService;
	
	@Test
	public void pruebaConsultarTodo() {
		try {
			List<Cliente> lista = clienteService.findAllClientes();
			assertEquals(lista.size(),2);
		}catch(Exception ex) {
			System.out.println("error "+ex);
		}
	}
}