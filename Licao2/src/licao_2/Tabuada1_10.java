package licao_2;
import java.util.Scanner;
public class Tabuada1_10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0;
		int tabuada = 0;
		while (tabuada <= 0 || tabuada > 10) {
		System.out.println("Qual tabuada que você quer? 1-10");
		tabuada = entrada.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			n = n + tabuada;
			System.out.println(n);
		}
		

	}

}

