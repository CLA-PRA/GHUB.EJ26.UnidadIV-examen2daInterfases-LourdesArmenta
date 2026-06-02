package logica;

import miPrincipal.Criterio;

public class CriterioPacCURP extends Criterio<Paciente> {
    @Override
    public int comparar(Paciente elemento1, Paciente elemento2) {
        return elemento1.getCurp().compareTo(elemento2.getCurp());
    }
}
