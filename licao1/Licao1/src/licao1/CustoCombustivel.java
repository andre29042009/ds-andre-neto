
package licao1;


public class CustoCombustivel {

   
    public static void main(String[] args) {
       int litro =  7;
       int km = 70;
       int km_por_litro = km / litro;
       int consumo = km / km_por_litro;
       int preco = 6;
       int valor = litro * preco;
       
        System.out.println("A quantidade de combustivel usado para percorrer a quilometragem e de "+consumo+" litros");
        System.out.println("O valor que foi pago com combustivel foi de "+valor+"RS");
   }
    
}
