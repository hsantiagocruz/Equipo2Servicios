package edu.utm.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.utm.bd.domain.Compra;
import edu.utm.service.compra.CompraService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class CompraServiceImplTest {
	@Inject
	CompraService compraService;
	@Test
	public void pruebaConsultarTodo() {
		try {
			List<Compra> lista = compraService.findAllCompras();
			assertEquals(lista.size(),4);
		}catch(Exception ex) {
			System.out.println("error "+ex);
		}
	}
	@Test
	public void pruebaBusca1Compra() {
		try {
			Compra c = new Compra();
			Compra result=null;
			c.setIdcompra("1");
			result=compraService.findOneCompra(c);
			System.out.println("Compra encontrada: "+result.getComtotal());
		}
		catch(Exception ex) {
			System.out.println("error "+ex);
		}
	}
}
