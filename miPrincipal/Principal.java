package miPrincipal;

import logica.CriterioPacCURP;
import logica.CriterioPacEdad;
import logica.CriterioPacNombre;
import logica.Fecha;
import logica.Paciente;
import logica.Util;

public class Principal {

    public static void main(String[] args) {
        Paciente[] pacientes = {
            new Paciente("Ana", "Lopez", "Garcia", "LOGA010101MDFPRNA1", new Fecha(1, 1, 2001), 24),
            new Paciente("Luis", "Martinez", "Perez", "MAPL020202HDFRRSA2", new Fecha(2, 2, 2002), 23),
            new Paciente("Sofia", "Hernandez", "Ruiz", "HERS030303MDFRZNA3", new Fecha(3, 3, 2003), 22),
            new Paciente("Diego", "Navarro", "Torres", "NATD040404HDFVRGA4", new Fecha(4, 4, 2004), 21),
            new Paciente("Carla", "Ortega", "Santos", "OSAC050505MDFNNLA5", new Fecha(5, 5, 2005), 20)
        };

        Paciente[] porCurp = pacientes.clone();
        Util.ordenar(porCurp, new CriterioPacCURP());
        System.out.println("\nOrdenados por CURP:");
        Util.imprimir(porCurp);

        Paciente[] porEdad = pacientes.clone();
        Util.ordenar(porEdad, new CriterioPacEdad());
        System.out.println("\nOrdenados por edad:");
        Util.imprimir(porEdad);

        Paciente[] porNombre = pacientes.clone();
        Util.ordenar(porNombre, new CriterioPacNombre());
        System.out.println("\nOrdenados por apellido paterno, materno y nombre:");
        Util.imprimir(porNombre);

        Paciente[] porComparable = pacientes.clone();
        Util.ordenar(porComparable);
        System.out.println("\nOrdenados con Comparable (compareTo por CURP):");
        Util.imprimir(porComparable);
    }
}