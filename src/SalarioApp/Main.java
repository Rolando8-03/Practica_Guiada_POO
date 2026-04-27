package SalarioApp;

import SalarioApp.modelos.Empleado;
import SalarioApp.modelos.Empresa;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Luis", 500);
        Empleado emp2 = new Empleado("Ana", 300);

        emp1.mostrarSalario();

        System.out.println("Bono: " + emp1.calcularBono());
        System.out.println("Salario total: " + emp1.calcularSalarioTotal());

        if (emp1.aplicaDescuento()) {
            System.out.println("Aplica descuento");
        } else {
            System.out.println("No aplica descuento");
        }

        // Empresa
        Empresa empresa = new Empresa();
        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);

        empresa.mostrarTotal();
    }
}
