import java.util.Scanner;

public class AtividadesJava5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salário do usuário: ");
        double salario = sc.nextDouble();

        double qtdSalarios = salario / 788.00;

        System.out.println("Esse usuário ganha " + qtdSalarios + " salários mínimos");
    }
}
