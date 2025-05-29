package projetocarro;

public class Moto {
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
	        System.out.println("Moto Buzinando");
	    }
	}

