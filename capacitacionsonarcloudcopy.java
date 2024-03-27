import java.util.Scanner;

public class capacitacionsonarcloudcopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simple");
        System.out.println("Ingrese el primer numero:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operacion: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

        int opcion = scanner.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero");
                    return;
                }
                break;
            default:
                System.out.println("Opción no valida");
                return;
        }

        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}
