import java.util.Scanner;

public class questao_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o operador (+, -, *, /):");
        char operador = scanner.next().charAt(0);

        double resultado;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + numero1 + " + " + numero2 + " = " + resultado);
                break;

            case '-':
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + numero1 + " - " + numero2 + " = " + resultado);
                break;

            case '*':
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + numero1 + " * " + numero2 + " = " + resultado);
                break;

            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + numero1 + " / " + numero2 + " = " + resultado);
                } else {
                    System.out.println("Erro: divisão por zero não é permitida.");
                }
                break;

            default:
                System.out.println("Operador inválido! Use apenas +, -, * ou /.");
                break;
        }
        scanner.close();
    }
}
