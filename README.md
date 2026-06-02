# Practica: Ordenamiento de Pacientes con Genéricos e Interfaces

## Objetivo
Desarrollar un programa en Java que ordene arreglos de pacientes usando criterios de comparación intercambiables.

## Competencias
1. Diseño orientado a objetos.
2. Uso de interfaces y clases abstractas.
3. Programación genérica.
4. Implementación de algoritmos de ordenamiento.
5. Pruebas manuales desde una clase principal.

## Enunciado
Construye un sistema mínimo para gestionar pacientes y ordenarlos con distintos criterios.

## Requerimientos funcionales
1. Crear una interfaz Comparable genérica con un método compareTo que regrese int y reciba un parámetro tipo T.
2. Crear una clase abstracta Criterio genérica con un método comparar que reciba dos parámetros tipo T y regrese int.
3. Crear una interfaz Identificable con un método obtenerId.
4. Crear una clase Paciente con estos atributos:
  1. nombre
  2. apellidoPaterno
  3. apellidoMat
  4. curp
  5. fechaNacimiento
  6. edad
5. Hacer que Paciente implemente Identificable y Comparable<Paciente>.
6. Hacer que obtenerId regrese la CURP.
7. Sobrescribir toString en Paciente para mostrar datos completos de forma legible.
8. Crear tres criterios concretos que extiendan Criterio:
  1. CriterioPacCURP
  2. CriterioPacEdad
  3. CriterioPacNombre, que compare en este orden:
    1. apellidoPaterno
    2. apellidoMat
    3. nombre
9. Crear una clase utilitaria Util con:
  1. Método ordenar tipo void que reciba arreglo y criterio.
  2. Sobrecarga ordenar que reciba un arreglo de Comparable.
  3. Método imprimir para mostrar cualquier arreglo.
10. Implementar ordenar con algoritmo burbuja.
11. En la clase principal:
  1. Crear un arreglo con al menos 5 pacientes.
  2. Ordenar por cada uno de los 3 criterios.
  3. Ordenar también usando la sobrecarga de Comparable (compareTo).
  4. Imprimir resultados de cada ordenamiento.

## Restricciones
1. No usar librerías de ordenamiento del lenguaje.
2. El método ordenar debe resolver el ordenamiento manualmente.
3. Debe poder reutilizarse con distintos tipos de arreglo y criterios.

## Entregables
1. Código fuente completo.
2. Captura o salida de consola con los cuatro ordenamientos.
3. Breve explicación de cómo funciona el método ordenar.

## Criterios de evaluación sugeridos
1. Modelo Paciente e identificación (obtenerId por CURP y toString funcional): 20 por ciento.
2. CriterioPacCURP correcto (comparación menor, mayor e igualdad): 20 por ciento.
3. Util.ordenar con Criterio funcionando en burbuja (edad y nombre completo): 30 por ciento.
4. Util.ordenar con Comparable funcionando en burbuja (compareTo): 20 por ciento.
5. Legibilidad, orden del código y ejecución sin fallas (make compile y make test): 10 por ciento.

## Retos opcionales
1. Agregar ordenamiento descendente.
2. Permitir elegir criterio por menú.
3. Agregar validaciones para datos vacíos o nulos.
4. Medir tiempo de ejecución por criterio.

## Ejecución

Compilar:

```bash
make compile
```

Ejecutar:

```bash
make run
```

Probar:

```bash
make test
```
