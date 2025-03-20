package licao1;
import java.util.Scanner;
public class Antecessor {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite numero: ");
        int numero1 = entrada.nextInt();
        
        int Antecessor = numero1 - 1;
        System.out.println("O antecessor é "+Antecessor);

    }
    
}
