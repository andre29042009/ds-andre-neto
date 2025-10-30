import java.util.Scanner;

public class AtividadesJav6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        System.out.println("Antecessor: " + (n - 1));
        System.out.println("Sucessor: " + (n + 1));
    }
}
