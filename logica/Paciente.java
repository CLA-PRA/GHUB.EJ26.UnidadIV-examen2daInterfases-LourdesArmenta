package logica;

import miPrincipal.Comparable;

public class Paciente implements Identificable, Comparable<Paciente> {
    private String nombre;
    private String apellidoMat;
    private String apellidoPaterno;
    private String curp;
    private Fecha fechaNacimiento;
    private int edad;

    public Paciente() {
    }

    public Paciente(String nombre, String apellidoMat, String apellidoPaterno, String curp, Fecha fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.apellidoMat = apellidoMat;
        this.apellidoPaterno = apellidoPaterno;
        this.curp = curp;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String obtenerId() {
        return curp;
    }

    @Override
    public int compareTo(Paciente elemento) {
        return this.curp.compareTo(elemento.getCurp());
    }

    @Override
    public String toString() {
        return apellidoPaterno + " " + apellidoMat + " " + nombre
            + " | Edad: " + edad
            + " | CURP: " + curp
            + " | Fecha nacimiento: " + fechaNacimiento;
    }
}
