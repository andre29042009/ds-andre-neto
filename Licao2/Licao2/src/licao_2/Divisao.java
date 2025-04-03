package licao_2;
import java.util.Scanner;
public class Divisao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		double primeiro = entrada.nextDouble();
		System.out.println("Digite o segundo número");
		double segundo = entrada.nextDouble();
		
		while (segundo == 0) {
			System.out.println("VALOR INVÁLIDO");
			System.out.println("Digite o segundo número");
			segundo = entrada.nextInt();
		}
		double divisao = primeiro / segundo;
		
		System.out.println("O valor da divisão do primeiro pelo segundo é "+divisao);
	}

}
