
package licao1;
import java.util.Scanner;


public class CustoCarro {

    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Qual o valor de fabrica do carro?");
    float custo_fabrica = entrada.nextFloat();
    float distribuidor = (custo_fabrica * 28) / 100;
    float imposto = (custo_fabrica * 45) / 100;
    float valor_final = custo_fabrica + distribuidor + imposto;
    System.out.println("O valor final do carro e "+valor_final);

    }
    
    
}
