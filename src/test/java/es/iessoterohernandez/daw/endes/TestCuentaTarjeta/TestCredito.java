package es.iessoterohernandez.daw.endes.TestCuentaTarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCredito {
	
	private Cuenta cuenta;
	private Credito credito;

	@BeforeEach
	public void init() {
		cuenta = new Cuenta("0", "Raúl Benítez");
		credito = new Credito("0", "Raúl Benítez", new Date(), 1000.0);
		credito.setCuenta(cuenta);
	}
	
	@Test
	public void testRetirar() throws Exception {
		credito.retirar(500.0);
		assertEquals(475.0, credito.getCreditoDisponible());
	}
	
	@Test
	public void testIngresar() throws Exception {
		credito.ingresar(500);
		assertEquals(1500, credito.getCreditoDisponible());
	}
	
	@Test
	public void testPagoEnEstablecimiento() throws Exception {
		credito.pagoEnEstablecimiento("Restaurante Maria Trifulca", 100.0);
		assertEquals(900.0, credito.getCreditoDisponible());
	}
	
	@Test
	public void testLiquidar() throws Exception {
		credito.ingresar(300.0);
		credito.pagoEnEstablecimiento("Compra Tienda Zara", 200.0);
		credito.liquidar(3, 2024);
		assertEquals(0.0, credito.getSaldo());
	}
	
}
