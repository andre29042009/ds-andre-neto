package licao_2;

public class Populacao {

	public static void main(String[] args) {
		int ano = 0;
		double populacaoA = 80000;
		double populacaoB = 200000;
		
		while (populacaoB >= populacaoA) {
			populacaoA = (populacaoA * 3 / 100) + populacaoA;
			populacaoB = (populacaoB * 1.5 / 100) + populacaoB;
			ano = ano + 1;
		}
		System.out.println("Demoraria "+ano+" anos para o pais A passar o pais B");
		
	}

}
