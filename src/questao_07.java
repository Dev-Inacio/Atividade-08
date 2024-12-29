import java.util.Scanner;

public class questao_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = scanner.nextLine();

        String[] palavras = frase.split("\\s+");

        System.out.println("Número de palavras é: " + palavras.length);
        scanner.close();
    }
}
