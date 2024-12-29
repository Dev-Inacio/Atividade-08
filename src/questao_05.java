import java.util.Scanner;

import java.util.Arrays;

public class questao_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira palavra:");
        String palavra1 = scanner.nextLine().toLowerCase();

        System.out.println("Digite a segunda palavra:");
        String palavra2 = scanner.nextLine().toLowerCase();

        char[] arr1 = palavra1.toCharArray();
        char[] arr2 = palavra2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("As palavras são anagramas.");
        } else {
            System.out.println("As palavras não são anagramas.");
        }
        scanner.close();
    }
}
