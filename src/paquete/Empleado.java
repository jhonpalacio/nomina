package paquete;

    // Clase Empleado
    public class Empleado {
        private String nombre;
        private String apellido;
        private double salario_base;

        public Empleado(String nombre, String apellido, double salario_base) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.salario_base = salario_base;
        }

        public double calcular_salario() {
            return salario_base;
        }

        // Getters y setters para los atributos
        // ...
    }

