package licao_2;
import java.util.Scanner;
public class MaiorN {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		int n = entrada.nextInt();
		while (n <= 0) {
			System.out.println("Digite um número");
			n = entrada.nextInt();
			for (int i = 1; i < n; i++) {
			System.out.println(i);
		}

	}
	}
}
