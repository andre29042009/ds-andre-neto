package projetocarro;

import javax.swing.JOptionPane;

public class ProjetoCarro {

    public static void main(String[] args) {
        String[] opcoesVeiculo = {"Carro", "Moto", "Caminhão"};
        int escolhaAutomovel = JOptionPane.showOptionDialog(
            null, "O que você quer?", "Escolha um veículo",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
            null, opcoesVeiculo, opcoesVeiculo[0]
        );

        if (escolhaAutomovel == -1) return; 
        
        String[] modelos = {};

        switch (escolhaAutomovel) {
            case 0: 
                modelos = new String[]{"Fiat Uno", "Honda Civic", "Volkswagen Gol", "Toyota Corolla", 
                                       "Hyundai HB20", "Chevrolet Onix", "Renault Sandero", "Renault Kwid", 
                                       "Ford Focus", "Fiat Palio"};
                break;
            case 1:
                modelos = new String[]{"Honda CG 160", "Yamaha Factor 150", "Honda Fan 125", "Honda XRE 300", 
                                       "Yamaha Lander 250", "Honda CB 500", "Yamaha MT-03", "BMW G 310R", 
                                       "Kawasaki Z400", "Suzuki GSR 750"};
                break;
            case 2: 
                modelos = new String[]{"Scania R500", "Volvo FH16", "Mercedes-Benz Actros", "Iveco Tector", 
                                       "Ford Cargo", "MAN TGX", "DAF XF", "Volkswagen Constellation", 
                                       "Renault Magnum", "Freightliner Cascadia"};
                break;
        }

        int escolhaModelo = JOptionPane.showOptionDialog(
            null, "Escolha um modelo:", "Modelos disponíveis",
            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
            null, modelos, modelos[0]
        );

        if (escolhaModelo == -1) return;

        JOptionPane.showMessageDialog(null, "Você escolheu: " + modelos[escolhaModelo]);

        executarAcao(escolhaAutomovel, escolhaModelo);
    }

    public static void executarAcao(int tipoVeiculo, int modeloSelecionado) {
        Object veiculo = null;

        switch (tipoVeiculo) {
            case 0:
                veiculo = criarCarro(modeloSelecionado);
                break;
            case 1: 
                veiculo = criarMoto(modeloSelecionado);
                break;
            case 2: 
                veiculo = criarCaminhao(modeloSelecionado);
                break;
        }

        if (veiculo == null) return;

        while (true) {
            String[] acoes = {"Buzinar", "Acelerar", "Freiar", "Sair"};
            int escolhaAcao = JOptionPane.showOptionDialog(
                null, "Escolha uma ação:", "Ações disponíveis",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, 
                null, acoes, acoes[0]
            );

            if (escolhaAcao == -1 || escolhaAcao == 3) break;

            switch (escolhaAcao) {
            case 0:
                if (veiculo instanceof Carro) {
                    ((Carro) veiculo).buzinar();
                    JOptionPane.showMessageDialog(null, "Carro Buzinando");
                } else if (veiculo instanceof Moto) {
                    ((Moto) veiculo).buzinar();
                    JOptionPane.showMessageDialog(null, "Moto Buzinando");
                } else if (veiculo instanceof Caminhao) {
                    ((Caminhao) veiculo).buzinar();
                    JOptionPane.showMessageDialog(null, "Caminhão Buzinando");
                }
                break;

            case 1:
                if (veiculo instanceof Carro) {
                    int aceleracao = 30;
                    ((Carro) veiculo).acelerar(aceleracao);
                    JOptionPane.showMessageDialog(null, "Velocidade atual do carro: " + ((Carro) veiculo).vel + " km/h");
                } else if (veiculo instanceof Moto) {
                    int aceleracao = 25;
                    ((Moto) veiculo).acelerar(aceleracao);
                    JOptionPane.showMessageDialog(null, "Velocidade atual da moto: " + ((Moto) veiculo).vel + " km/h");
                } else if (veiculo instanceof Caminhao) {
                    int aceleracao = 15;
                    ((Caminhao) veiculo).acelerar(aceleracao);
                    JOptionPane.showMessageDialog(null, "Velocidade atual do caminhão: " + ((Caminhao) veiculo).vel + " km/h");
                }
                break;

            case 2:
                if (veiculo instanceof Carro) {
                    int reduzir = 10;
                    ((Carro) veiculo).freiar(reduzir);
                    JOptionPane.showMessageDialog(null, "Velocidade atual do carro após frear: " + ((Carro) veiculo).vel + " km/h");
                } else if (veiculo instanceof Moto) {
                    int reduzir = 8;
                    ((Moto) veiculo).freiar(reduzir);
                    JOptionPane.showMessageDialog(null, "Velocidade atual da moto após frear: " + ((Moto) veiculo).vel + " km/h");
                } else if (veiculo instanceof Caminhao) {
                    int reduzir = 5;
                    ((Caminhao) veiculo).freiar(reduzir);
                    JOptionPane.showMessageDialog(null, "Velocidade atual do caminhão após frear: " + ((Caminhao) veiculo).vel + " km/h");
                }
                break;
        }

        }
    }

    public static Carro criarCarro(int modeloSelecionado) {
        String[] nomes = {"Fiat Uno", "Honda Civic", "Volkswagen Gol", "Toyota Corolla", "Hyundai HB20",
                          "Chevrolet Onix", "Renault Sandero", "Renault Kwid", "Ford Focus", "Fiat Palio"};
        String[] marcas = {"Fiat", "Honda", "Volkswagen", "Toyota", "Hyundai",
                           "Chevrolet", "Renault", "Renault", "Ford", "Fiat"};
        int[] anos = {2015, 2020, 2018, 2022, 2019, 2021, 2017, 2023, 2016, 2014};
        int[] velocidades = {120, 100, 90, 110, 95, 105, 85, 120, 115, 88};

        Carro carro = new Carro();
        carro.nome = nomes[modeloSelecionado];
        carro.marca = marcas[modeloSelecionado];
        carro.ano = anos[modeloSelecionado];
        carro.vel = velocidades[modeloSelecionado];

        return carro;
    }

    public static Moto criarMoto(int modeloSelecionado) {
        String[] nomes = {"Honda CG 160", "Yamaha Factor 150", "Honda Fan 125", "Honda XRE 300", "Yamaha Lander 250",
                          "Honda CB 500", "Yamaha MT-03", "BMW G 310R", "Kawasaki Z400", "Suzuki GSR 750"};
        String[] marcas = {"Honda", "Yamaha", "Honda", "Honda", "Yamaha",
                           "Honda", "Yamaha", "BMW", "Kawasaki", "Suzuki"};
        int[] anos = {2020, 2021, 2018, 2022, 2021, 2019, 2020, 2021, 2022, 2019};
        int[] velocidades = {80, 90, 70, 100, 95, 105, 95, 90, 110, 100};

        Moto moto = new Moto();
        moto.nome = nomes[modeloSelecionado];
        moto.marca = marcas[modeloSelecionado];
        moto.ano = anos[modeloSelecionado];
        moto.vel = velocidades[modeloSelecionado];

        return moto;
    }

    public static Caminhao criarCaminhao(int modeloSelecionado) {
        String[] nomes = {"Scania R500", "Volvo FH16", "Mercedes-Benz Actros", "Iveco Tector", "Ford Cargo",
                          "MAN TGX", "DAF XF", "Volkswagen Constellation", "Renault Magnum", "Freightliner Cascadia"};
        String[] marcas = {"Scania", "Volvo", "Mercedes-Benz", "Iveco", "Ford",
                           "MAN", "DAF", "Volkswagen", "Renault", "Freightliner"};
        int[] anos = {2019, 2020, 2018, 2017, 2016, 2021, 2019, 2018, 2017, 2020};
        int[] velocidades = {90, 85, 80, 75, 70, 88, 85, 78, 80, 90};

        Caminhao caminhao = new Caminhao();
        caminhao.nome = nomes[modeloSelecionado];
        caminhao.marca = marcas[modeloSelecionado];
        caminhao.ano = anos[modeloSelecionado];
        caminhao.vel = velocidades[modeloSelecionado];

        return caminhao;
    }
}
