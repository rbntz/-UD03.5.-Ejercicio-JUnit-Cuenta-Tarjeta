package es.iessoterohernandez.daw.endes.TestCuentaTarjeta;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestCuenta {
	
	private Cuenta cuenta;

	@BeforeEach
	public void init() {
		cuenta = new Cuenta("0001", "Raúl Benítez");
	}
	
	@Test
	public void testIngresarDinero() {
		Movimiento m=new Movimiento();
		m.setImporte(2000);
		assertEquals(2000, m.getImporte());
	}
	
	@Test
	public void testRetirarDinero() {
		
	}
	
	@Test
	public void testIngresarDineroConConcepto() {
		
	}
	
	@Test
	public void testRetirarDineroConConcepto() {
		
	}
	
	@Test
	public void testAñadirMovimiento() {
		
	}
	
	@Test
	public void testGetSaldo() {
		
	}

}
