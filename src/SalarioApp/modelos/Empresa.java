package SalarioApp.modelos;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
    }

    public double calcularTotalSalarios() {
        double total = 0;

        for (Empleado emp : empleados) {
            total += emp.calcularSalarioTotal();
        }

        return total;
    }
}