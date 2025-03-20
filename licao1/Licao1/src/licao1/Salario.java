
package licao1;
import java.util.Scanner;

public class Salario {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu salario atual? ");
        float salario = entrada.nextFloat();
        System.out.println("Qual o percentual de aumento? ");
        float aumento = entrada.nextFloat();
        
        float salarioNovo = (salario*aumento) / 100 + salario;
        System.out.println("Seu novo salario e "+salarioNovo);

    }
    
}
