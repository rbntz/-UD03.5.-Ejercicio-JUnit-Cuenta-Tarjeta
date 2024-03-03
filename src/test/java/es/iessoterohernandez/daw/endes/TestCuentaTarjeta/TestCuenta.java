package es.iessoterohernandez.daw.endes.TestCuentaTarjeta;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCuenta {
	
	private Cuenta cuenta;

	@BeforeEach
	public void init() {
		cuenta = new Cuenta("0", "Raúl Benítez");
	}
	
	@Test
	public void testIngresar() throws Exception {
		cuenta.ingresar(1000.0);
		assertEquals(1000.0, cuenta.getSaldo());
	}
	
	@Test
	public void testRetirar() throws Exception {
		cuenta.ingresar(2000.0);
		cuenta.retirar(1000.0);
		assertEquals(1000.0, cuenta.getSaldo());
	}

	@Test
	public void testIngresarConConcepto() throws Exception {
		cuenta.ingresar("Nómina Enero 2023", 1000.0);
		assertEquals(1000.0, cuenta.getSaldo());
	}

	@Test
	public void testRetirarConConcepto() throws Exception {
		cuenta.ingresar("Nómina Junio + Paga Extra", 2000.0);
		cuenta.retirar(1000.0);
		assertEquals(1000.0, cuenta.getSaldo());
	}
	
    @Test
    public void testSaldoDespuesAgregarMovimiento() {
        Movimiento movimiento = new Movimiento();
        movimiento.setConcepto("Nómina Noviembre");
        movimiento.setImporte(1000.0);
        cuenta.addMovimiento(movimiento);
        assertEquals(1000.0, cuenta.getSaldo());
    }

}
