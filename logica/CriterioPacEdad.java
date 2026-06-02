package logica;

import miPrincipal.Criterio;

public class CriterioPacEdad extends Criterio<Paciente> {
    @Override
    public int comparar(Paciente elemento1, Paciente elemento2) {
        return elemento1.getEdad() - elemento2.getEdad();
    }
}
