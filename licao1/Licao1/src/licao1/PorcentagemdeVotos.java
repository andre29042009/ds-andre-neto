
package licao1;
import java.util.Scanner;

public class PorcentagemdeVotos {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos eleitores tem o munícipio? ");
        float eleitores = entrada.nextFloat();
        System.out.println("Quantos votos brancos tem? ");
        float branco = entrada.nextFloat();
        System.out.println("Quantos votos nulos tem? ");
        float nulo = entrada.nextFloat();
        System.out.println("Quantos votos validos tem? ");
        float valido = entrada.nextFloat();
        
             if (eleitores != branco + nulo + valido)
            {
                System.out.println("FRAUDE!(mais votos que eleitores ou vice e versa");
            }
        
        float PorcentagemBranco = (branco/eleitores)* 100;
        float PorcentagemNulo = (nulo/eleitores)*100;
        float PorcentagemValido = (valido/eleitores)*100;

        System.out.println("A porcentagem de votos brancos é de "+PorcentagemBranco+"%");
        System.out.println("A porcentagem de votos brancos é de "+PorcentagemNulo+"%");
        System.out.println("A porcentagem de votos brancos é de "+PorcentagemValido+"%");


        
        
    }
    
}
