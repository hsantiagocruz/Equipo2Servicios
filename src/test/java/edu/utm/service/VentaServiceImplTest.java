package edu.utm.service;
import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.utm.bd.domain.Venta;
import edu.utm.service.venta.VentaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class VentaServiceImplTest {
	@Inject
	VentaService ventaService;
	
	@Test
	public void pruebaBusca1Venta() {
		try {
			Venta v = new Venta();
			Venta result=null;
			v.setIdventa("1122334455");
			result=ventaService.findOneVenta(v);
			System.out.println("Id Venta: "+result.getIdventa());
			System.out.println("Venta Total: "+result.getVentotal());
			System.out.println("Fecha de Venta: "+result.getVenfecha());
			System.out.println("Venta econtrada: "+result.getClienteId());
			System.out.println("Venta econtrada: "+result.getUsuarioId());
		}
		catch(Exception ex) {
			System.out.println("error "+ex);
		}
	}
	@Test
	public void pruebaConsultarTodo() {
		try {
			List<Venta> lista = ventaService.findAllVentas();
			assertEquals(lista.size(),4);
		}catch(Exception ex) {
			System.out.println("error "+ex);
		}
	}
	@Test
	public void pruebaInsertarVenta() {
		try {
			Venta v = new Venta();
			v.setIdventa("1234567891");
			java.util.Date d = new java.util.Date();  
			java.sql.Date date2 = new java.sql.Date(d.getTime());
			v.setVenfecha(date2);
			v.setUsuarioId(1);
			v.setClienteId(2);
			v.setVentotal(20);
			ventaService.insertVenta(v);
			System.out.println("Venta insertado: "+ v.getIdventa());
		}
		catch(Exception ex) {
			System.out.println("error "+ex);
		}
	}
}
