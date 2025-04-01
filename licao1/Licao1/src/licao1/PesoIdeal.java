package licao1;
import java.util.Scanner;
public class PesoIdeal {

	public static void main(String[] args) {
		double peso_ideal = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual o seu sexo? M ou F");
		String sexo = entrada.nextLine();
			System.out.println("Qual a sua altura?");
			double altura = entrada.nextDouble();
			if (sexo == "m") {
				peso_ideal = (72.7 * altura) - 58;
			}
			else {
				peso_ideal = (62.1 * altura ) - 44.7;
			}
			System.out.println("Seu peso ideal é "+peso_ideal+"kg");

	}

}
