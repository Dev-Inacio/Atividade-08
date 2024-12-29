import java.util.Scanner;

public class questao_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        int invertido = 0;

        while (numero != 0) {
            invertido = invertido * 10 + numero % 10;
            numero = numero / 10;
        }
        System.out.println("Número invertido: " + invertido);
        scanner.close();
    }
}
