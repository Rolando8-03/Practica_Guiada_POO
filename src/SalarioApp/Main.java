package SalarioApp;

import SalarioApp.modelos.Empleado;
import SalarioApp.modelos.Empresa;

public class Main {
    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Luis", 500);
        Empleado emp2 = new Empleado("Ana", 300);

        System.out.println("Información de empleados:\n");

        System.out.println("Empleado: " + emp1.getNombre());
        System.out.println("Salario base: " + emp1.getSalarioBase());
        System.out.println("Bono: " + emp1.calcularBono());
        System.out.println("Salario total: " + emp1.calcularSalarioTotal());
        System.out.println(emp1.aplicaDescuento() ? "Aplica descuento" : "No aplica descuento");

        System.out.println();

        System.out.println("Empleado: " + emp2.getNombre());
        System.out.println("Salario base: " + emp2.getSalarioBase());
        System.out.println("Bono: " + emp2.calcularBono());
        System.out.println("Salario total: " + emp2.calcularSalarioTotal());
        System.out.println(emp2.aplicaDescuento() ? "Aplica descuento" : "No aplica descuento");

        Empresa empresa = new Empresa();
        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);

        System.out.println("\nTotal de salarios a pagar: " + empresa.calcularTotalSalarios());
    }
}