package projetocarro;

public class Caminhao {
	// atributos
    String  nome;
    String  marca;
    int ano;
    int vel;
    
    //métodos
    void acelerar(int aceleracao){
        vel+=aceleracao;
    }
    
    void freiar(int reduzir){
        vel-=reduzir;
    }
    
    void buzinar(){
        System.out.println("Caminhão Buzinando");
    }
}
