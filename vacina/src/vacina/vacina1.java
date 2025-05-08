package vacina;
import java.util.Scanner;

public class vacina1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        
        System.out.print("Quantos genes você quer analisar? ");
        int quantidade = entrada.nextInt();
        entrada.nextLine();

        int gene[] = new int[quantidade];
        
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o gene " + (i + 1) + ":");
            gene[i] = entrada.nextInt();
        }

        int geneAnalisado = gene[quantidade - 1];

        for (int a = 0; a < quantidade; a++) {
            if (gene[a] == geneAnalisado) {
                contador++;
            }
        }

        if (contador > 2) {
            System.out.println("Achei o danado");
        } else if (contador == 2) {
            System.out.println("Ainda não é suficiente");
        } else {
            System.out.println("Sumiuu!");
        }
    }
}

// feito por Andre Garrido e Artur Araujo