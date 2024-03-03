package es.iessoterohernandez.daw.endes.TestCuentaTarjeta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestDebito {
	
	private Cuenta cuenta;
	private Debito debito;

	@BeforeEach
	public void init() {
		cuenta = new Cuenta("0", "Raúl Benítez");
		debito = new Debito("0", "Raúl Benítez", new Date());
		debito.setCuenta(cuenta);
	}
	
	@Test
	public void testRetirar() throws Exception {
		cuenta.ingresar(1000.0);
		debito.retirar(100.0);
		assertEquals(900.0, cuenta.getSaldo());
		
	}
	
	@Test
	public void testIngresar() throws Exception {
		debito.ingresar(100.0);
		assertEquals(100.0, cuenta.getSaldo());
	}
	
	@Test
	public void testPagoEnEstablecimiento() throws Exception {
		cuenta.ingresar(1000.0);
		debito.pagoEnEstablecimiento("Alquiler Tumbona en la Playa", 40.0);
		assertEquals(960.0, cuenta.getSaldo());
	}

}
