package SalarioApp.modelos;

public class Empleado {
    private String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularBono() {
        return salarioBase * 0.10;
    }

    public double calcularSalarioTotal() {
        return salarioBase + calcularBono();
    }

    public boolean aplicaDescuento() {
        return salarioBase > 400;
    }
}