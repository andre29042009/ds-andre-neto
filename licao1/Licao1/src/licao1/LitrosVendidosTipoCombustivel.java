package licao1;
import java.util.Scanner;

public class LitrosVendidosTipoCombustivel {
	public static void main(String[] args) {
		double preco = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o número de litros vendidos?");
		double litros_vendidos = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Tipo de combustivel: \n- Álcool\n- Gasolina");
		String tipo = entrada.nextLine();
		
		if(tipo.equals("alcool")) {
			preco = 2.90 * litros_vendidos;
		}
		if(tipo.equals("gasolina")) {
			preco = 3.30 * litros_vendidos;
		}
		System.out.println("O valor a ser pago é "+preco);
	}
}
