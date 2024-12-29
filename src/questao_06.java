import java.util.Scanner;
import java.util.Random;

public class questao_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int numeroCorreto = random.nextInt(50) + 1;
        int palpite = 0;

        System.out.println("Tente adivinhar o número entre 1 e 50:");


        while (palpite != numeroCorreto) {
            palpite = scanner.nextInt();

            if (palpite == numeroCorreto) {
                System.out.println("Parabéns! Você acertou!");
            } else {
                System.out.println("Palpite está Errado! Tente novamente.");
            }
        }
        scanner.close();
    }
}
