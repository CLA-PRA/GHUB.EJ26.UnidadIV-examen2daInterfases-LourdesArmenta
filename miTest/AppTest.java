package miTest;

import logica.CriterioPacCURP;
import logica.CriterioPacEdad;
import logica.CriterioPacNombre;
import logica.Fecha;
import logica.Paciente;
import logica.Util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
	@Test
	void obtenerIdDebeRegresarCurp() {
		Paciente paciente = new Paciente(
			"Ana", "Lopez", "Garcia", "LOGA010101MDFPRNA1", new Fecha(1, 1, 2001), 24
		);

		assertEquals("LOGA010101MDFPRNA1", paciente.obtenerId());
	}

	@Test
	void criterioPacCURPDebeCompararPorCurp() {
		Paciente p1 = new Paciente(
			"Ana", "Lopez", "Garcia", "AAAA010101MDFPRNA1", new Fecha(1, 1, 2001), 24
		);
		Paciente p2 = new Paciente(
			"Luis", "Martinez", "Perez", "ZZZZ020202HDFRRSA2", new Fecha(2, 2, 2002), 23
		);

		CriterioPacCURP criterio = new CriterioPacCURP();

		assertTrue(criterio.comparar(p1, p2) < 0);
		assertTrue(criterio.comparar(p2, p1) > 0);
		assertEquals(0, criterio.comparar(p1, p1));

		miPrincipal.Comparable[] pacientes = { p2, p1 };
		Util.ordenar(pacientes);

		Paciente primero = (Paciente) pacientes[0];
		Paciente segundo = (Paciente) pacientes[1];

		assertEquals("AAAA010101MDFPRNA1", primero.getCurp());
		assertEquals("ZZZZ020202HDFRRSA2", segundo.getCurp());
	}

	@Test
	void utilOrdenarDebeOrdenarPorEdad() {
		Paciente[] pacientes = {
			new Paciente("Ana", "Lopez", "Garcia", "CURP1", new Fecha(1, 1, 2001), 24),
			new Paciente("Luis", "Martinez", "Perez", "CURP2", new Fecha(2, 2, 2002), 20),
			new Paciente("Sofia", "Hernandez", "Ruiz", "CURP3", new Fecha(3, 3, 2003), 22)
		};

		Util.ordenar(pacientes, new CriterioPacEdad());

		assertEquals(20, pacientes[0].getEdad());
		assertEquals(22, pacientes[1].getEdad());
		assertEquals(24, pacientes[2].getEdad());
	}

	@Test
	void utilOrdenarDebeOrdenarPorApellidoPaternoMaternoYNombre() {
		Paciente[] pacientes = {
			new Paciente("Luis", "Perez", "Gomez", "CURP1", new Fecha(1, 1, 2001), 24),
			new Paciente("Ana", "Lopez", "Gomez", "CURP2", new Fecha(2, 2, 2002), 23),
			new Paciente("Carla", "Lopez", "Alvarez", "CURP3", new Fecha(3, 3, 2003), 22),
			new Paciente("Bea", "Lopez", "Gomez", "CURP4", new Fecha(4, 4, 2004), 21)
		};

		Util.ordenar(pacientes, new CriterioPacNombre());

		assertEquals("Alvarez", pacientes[0].getApellidoPaterno());
		assertEquals("Gomez", pacientes[1].getApellidoPaterno());
		assertEquals("Lopez", pacientes[1].getApellidoMat());
		assertEquals("Ana", pacientes[1].getNombre());
		assertEquals("Bea", pacientes[2].getNombre());
		assertEquals("Perez", pacientes[3].getApellidoMat());
	}
}