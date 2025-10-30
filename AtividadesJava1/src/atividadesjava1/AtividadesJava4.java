import java.util.Scanner;

public class AtividadesJava4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Porcentagem IPI: ");
        double ipi = sc.nextDouble();

        System.out.print("Código peça 1: ");
        int cod1 = sc.nextInt();
        System.out.print("Valor unitário peça 1: ");
        double valor1 = sc.nextDouble();
        System.out.print("Quantidade peça 1: ");
        int quant1 = sc.nextInt();

        System.out.print("Código peça 2: ");
        int cod2 = sc.nextInt();
        System.out.print("Valor unitário peça 2: ");
        double valor2 = sc.nextDouble();
        System.out.print("Quantidade peça 2: ");
        int quant2 = sc.nextInt();

        double total = (valor1 * quant1 + valor2 * quant2) * (ipi / 100 + 1);

        System.out.println("Valor total a pagar: " + total);
    }
}
