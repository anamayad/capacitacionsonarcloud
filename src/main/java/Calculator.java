public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Introduzca el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Seleccione la operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();

        int resultado = 0;

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
                if (num2 == 0) {
                    System.out.println("No se puede dividir por 0");
                } else {
                    resultado = num1 / num2;
                }
                break;
            default:
                System.out.println("Opción no válida");
        }

        if (opcion >= 1 && opcion <= 4) {
            System.out.println("El resultado de la operación es: " + resultado);
        }
    }
}
