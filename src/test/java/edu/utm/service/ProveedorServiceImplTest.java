package edu.utm.service;
import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.utm.bd.domain.Proveedor;
import edu.utm.service.proveedor.ProveedorService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ProveedorServiceImplTest {
	@Inject
	ProveedorService proveedorService;
	
	@Test
	public void pruebaConsultarTodo() {
		try {
			List<Proveedor> lista = proveedorService.findAllProveedor();
			assertEquals(lista.size(),4);
			if( lista.size()>0 ) {
				System.out.println("Consulta todos los proveedores realizada");
			}
		}catch(Exception ex) {
			System.out.println("error "+ex);
		}
	}
	
	@Test
	public void pruebaBusca1Proveedor() {
		try {
			Proveedor c = new Proveedor();
			Proveedor result=null;
			c.setIdproveedor(1);
			result=proveedorService.findOneProveedor( c );
			System.out.println("Proveedor encontrado: "+ result.getProvnombre() ); ///
		}
		catch(Exception ex) {
			System.out.println("error "+ex);
		}
	}
}
