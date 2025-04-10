package licao_2;
import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual número você quer que fatore?");
		int numero = entrada.nextInt();
		int fatorial = 1;
		
		for (int i = numero; i != 0; i--) {
			fatorial = i * fatorial;
	
		}
		System.out.println("O fatorial de "+numero+" é: "+fatorial);
	}

}
