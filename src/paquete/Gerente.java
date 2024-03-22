package paquete;


// Clase Gerente
public class Gerente extends Empleado {
    private double bono_gestion;

    public Gerente(String nombre, String apellido, double salario_base, double bono_gestion) {
        super(nombre, apellido, salario_base);
        this.bono_gestion = bono_gestion;
    }

    @Override
    public double calcular_salario() {
        return super.calcular_salario() + bono_gestion;
    }
}