package licao_2;
import java.util.Scanner;
public class Nota {

	public static void main(String[] args) {
		int novo_calculo = 1;
		while (novo_calculo == 1) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a nota 1 do aluno");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a nota 2 do aluno");
		double nota2 = entrada.nextDouble();
		while ( (nota1 > 10) &&  (nota1 < 0)) {
			System.out.println("O valor válido é apenas maior que 0 e menor que 10");
			System.out.println("Digite a nota 1 do aluno");
			nota1 = entrada.nextDouble();
		}
		while ((nota2 > 10) &&  (nota2 < 0)) {
			System.out.println("O valor válido é apenas maior que 0 e menor que 10");
			System.out.println("Digite a nota 2 do aluno");
			nota2 = entrada.nextDouble();
		}
		double media = (nota1 + nota2) / 2;
		
		System.out.println("A média das notas 1 e 2 do aluno é de "+media);
		System.out.println("Novo cálculo? 1 - Sim ; 2 - Não");
		novo_calculo = entrada.nextInt();
		
		}
	}

}
