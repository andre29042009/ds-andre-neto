package licao1;

public class Vendedor {

    public static void main(String[] args) {
        String nome = "Jair Bolsonaro";
        int salario = 2400;
        int vendas = 5000;
        int comissao = vendas * 15/100;
        int salario_final = salario + comissao;
        System.out.println("Nome:"+nome);
        System.out.println("Salario fixo:"+salario);
        System.out.println("Vendas:"+vendas);
        System.out.println("Salario final:"+salario_final);
    }
    
}
