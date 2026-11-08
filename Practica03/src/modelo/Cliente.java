package modelo;

import java.time.LocalDate;

public class Cliente {

    private int numero;
    private String nombre;
    private double puntos;
    private LocalDate fechaNacimiento;

    public Cliente(int numero, String nombre,
                   double puntos, LocalDate fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.puntos = puntos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }
    
    public double getPuntos() {
        return puntos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(double puntos) {
        this.puntos = puntos;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numero=" + numero + ", nombre=" + nombre + ", puntos=" + puntos + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
}
