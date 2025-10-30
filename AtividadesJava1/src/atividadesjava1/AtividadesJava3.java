import java.util.Scanner;

public class AtividadesJava3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        double novoSaldo = saldo * 1.01;

        System.out.println("Saldo reajustado: " + novoSaldo);
    }
}
