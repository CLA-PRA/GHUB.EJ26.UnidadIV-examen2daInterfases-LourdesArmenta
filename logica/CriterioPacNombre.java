package logica;

import miPrincipal.Criterio;

public class CriterioPacNombre extends Criterio<Paciente> {
    @Override
    public int comparar(Paciente elemento1, Paciente elemento2) {
        int comparacion = elemento1.getApellidoPaterno().compareTo(elemento2.getApellidoPaterno());
        if (comparacion != 0) {
            return comparacion;
        }

        comparacion = elemento1.getApellidoMat().compareTo(elemento2.getApellidoMat());
        if (comparacion != 0) {
            return comparacion;
        }

        return elemento1.getNombre().compareTo(elemento2.getNombre());
    }
}
