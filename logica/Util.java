package logica;

import miPrincipal.Comparable;
import miPrincipal.Criterio;

public class Util {
    public static <T> void ordenar(T[] arreglo, Criterio criterio) {
        

        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (criterio.comparar(arreglo[j], arreglo[j + 1]) > 0) {
                    T temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }
    }

    public static <T> void imprimir(T[] arreglo) {
       
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    public static void ordenar(Comparable[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - 1 - i; j++) {
                if (arreglo[j].compareTo(arreglo[j + 1]) > 0) {
                    Comparable temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }
    }
}
