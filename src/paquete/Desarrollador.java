package paquete;

// Clase Desarrollador
public class Desarrollador extends Empleado {
    private double horas_extra;

    public Desarrollador(String nombre, String apellido, double salario_base, double horas_extra) {
        super(nombre, apellido, salario_base);
        this.horas_extra = horas_extra;
    }

    @Override
    public double calcular_salario() {
        return super.calcular_salario() + horas_extra * 50;
    }
}
