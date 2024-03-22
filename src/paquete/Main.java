package paquete;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    public class Main {
        public static void main(String[] args) {
            Empleado empleado1 = new Gerente("Juan", "Perez", 5000000, 1000000);
            double salario1 = empleado1.calcular_salario();

            Empleado empleado2 = new Desarrollador("Maria", "Gomez", 4000000, 10);
            double salario2 = empleado2.calcular_salario();

            // Imprimir resultados
            System.out.println("Salario Gerente: " + salario1);
            System.out.println("Salario Desarrollador: " + salario2);
        }
    }