package SalarioApp;

import SalarioApp.modelos.Empleado;

public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Luis", 500);

        emp.mostrarSalario();

        double bono = emp.calcularBono();
        System.out.println("Bono: " + bono);

        System.out.println("Salario total: " + emp.calcularSalarioTotal());
    }
}
