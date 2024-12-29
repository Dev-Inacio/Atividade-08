public class questao_03 {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        System.out.println("Sequência de Fibonacci:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
