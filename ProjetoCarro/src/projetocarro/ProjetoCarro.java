/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetocarro;
import java.util.Scanner;

// Feito por Andre Garrido e Artur Araujo
public class ProjetoCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
    	System.out.println("O que você quer?\n 1- Carro\n 2- Caminhão\n 3- Moto");
    	int escolhaAutomovel = sc.nextInt();
    	switch (escolhaAutomovel) {
    	case 1:	
        	System.out.println("Qual carro você quer escolher?\n 1- Fiat Uno 2\n 2- Honda Civic\n 3- Volkswagen Gol\n 4- Toyota Corolla\n 5- Hyundai HB20\n 6- Chevrolet Onix\n 7- Renault Sandero\n 8- Renault Kwid\n 9- Ford Focus\n 10- Fiat Palio");
        	int escolhaCarro = sc.nextInt();
        	switch (escolhaCarro) {
            case 1:
                Carro c1 = new Carro();
                c1.nome = "UNO";
                c1.marca = "FIAT";
                c1.ano = 2015;
                c1.vel = 120;
                c1.acelerar(200);
                System.out.println("Velocidade: " + c1.vel + " KM");
                c1.freiar(5);
                System.out.println("Velocidade Apos Freio: " + c1.vel + " km");
                c1.buzinar();
                break;

            case 2:
                Carro c2 = new Carro();
                c2.nome = "Civic";
                c2.marca = "Honda";
                c2.ano = 2020;
                c2.vel = 100;
                c2.acelerar(30);
                System.out.println("Velocidade: " + c2.vel + " KM");
                c2.freiar(20);
                System.out.println("Velocidade Apos Freio: " + c2.vel + " km");
                c2.buzinar();
                break;

            case 3:
                Carro c3 = new Carro();
                c3.nome = "Gol";
                c3.marca = "Volkswagen";
                c3.ano = 2018;
                c3.vel = 90;
                c3.acelerar(25);
                System.out.println("Velocidade: " + c3.vel + " KM");
                c3.freiar(15);
                System.out.println("Velocidade Apos Freio: " + c3.vel + " km");
                c3.buzinar();
                break;

            case 4:
                Carro c4 = new Carro();
                c4.nome = "Corolla";
                c4.marca = "Toyota";
                c4.ano = 2022;
                c4.vel = 110;
                c4.acelerar(35);
                System.out.println("Velocidade: " + c4.vel + " KM");
                c4.freiar(25);
                System.out.println("Velocidade Apos Freio: " + c4.vel + " km");
                c4.buzinar();
                break;

            case 5:
                Carro c5 = new Carro();
                c5.nome = "HB20";
                c5.marca = "Hyundai";
                c5.ano = 2019;
                c5.vel = 95;
                c5.acelerar(22);
                System.out.println("Velocidade: " + c5.vel + " KM");
                c5.freiar(30);
                System.out.println("Velocidade Apos Freio: " + c5.vel + " km");
                c5.buzinar();
                break;

            case 6:
                Carro c6 = new Carro();
                c6.nome = "Onix";
                c6.marca = "Chevrolet";
                c6.ano = 2021;
                c6.vel = 105;
                c6.acelerar(28);
                System.out.println("Velocidade: " + c6.vel + " KM");
                c6.freiar(40);
                System.out.println("Velocidade Apos Freio: " + c6.vel + " km");
                c6.buzinar();
                break;

            case 7:
                Carro c7 = new Carro();
                c7.nome = "Sandero";
                c7.marca = "Renault";
                c7.ano = 2017;
                c7.vel = 85;
                c7.acelerar(18);
                System.out.println("Velocidade: " + c7.vel + " KM");
                c7.freiar(10);
                System.out.println("Velocidade Apos Freio: " + c7.vel + " km");
                c7.buzinar();
                break;

            case 8:
                Carro c8 = new Carro();
                c8.nome = "Kwid";
                c8.marca = "Renault";
                c8.ano = 2023;
                c8.vel = 120;
                c8.acelerar(195);
                System.out.println("Velocidade: " + c8.vel + " KM");
                c8.freiar(5);
                System.out.println("Velocidade Apos Freio: " + c8.vel + " km");
                c8.buzinar();
                break;

            case 9:
                Carro c9 = new Carro();
                c9.nome = "Focus";
                c9.marca = "Ford";
                c9.ano = 2016;
                c9.vel = 115;
                c9.acelerar(33);
                System.out.println("Velocidade: " + c9.vel + " KM");
                c9.freiar(38);
                System.out.println("Velocidade Apos Freio: " + c9.vel + " km");
                c9.buzinar();
                break;

            case 10:
                Carro c10 = new Carro();
                c10.nome = "Palio";
                c10.marca = "FIAT";
                c10.ano = 2014;
                c10.vel = 88;
                c10.acelerar(26);
                System.out.println("Velocidade: " + c10.vel + " KM");
                c10.freiar(22);
                System.out.println("Velocidade Apos Freio: " + c10.vel + " km");
                c10.buzinar();
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
        	break;
    	case 3:
    		System.out.println("Qual moto você quer escolher?\n1- Honda CG 160\n  2- Yamaha Factor 150\n  3- Honda Fan 125\n  4- Honda XRE 300\n  5- Yamaha Lander 250\n  6- Honda CB 500\n  7- Yamaha MT-03\n  8- BMW G 310R\n  9- Kawasaki Z400\n  10- Suzuki GSR 750");
    		int escolhaMoto = sc.nextInt();

    		switch (escolhaMoto) {
    		    case 1:
    		        Moto m1 = new Moto();
    		        m1.nome = "CG 160";
    		        m1.marca = "Honda";
    		        m1.ano = 2020;
    		        m1.vel = 80;
    		        m1.acelerar(15);
    		        System.out.println("Velocidade: " + m1.vel + " KM");
    		        m1.freiar(10);
    		        System.out.println("Velocidade Apos Freio: " + m1.vel + " km");
    		        m1.buzinar();
    		        break;

    		    case 2:
    		        Moto m2 = new Moto();
    		        m2.nome = "Factor 150";
    		        m2.marca = "Yamaha";
    		        m2.ano = 2021;
    		        m2.vel = 90;
    		        m2.acelerar(20);
    		        System.out.println("Velocidade: " + m2.vel + " KM");
    		        m2.freiar(15);
    		        System.out.println("Velocidade Apos Freio: " + m2.vel + " km");
    		        m2.buzinar();
    		        break;

    		    case 3:
    		        Moto m3 = new Moto();
    		        m3.nome = "Fan 125";
    		        m3.marca = "Honda";
    		        m3.ano = 2018;
    		        m3.vel = 70;
    		        m3.acelerar(12);
    		        System.out.println("Velocidade: " + m3.vel + " KM");
    		        m3.freiar(8);
    		        System.out.println("Velocidade Apos Freio: " + m3.vel + " km");
    		        m3.buzinar();
    		        break;

    		    case 4:
    		        Moto m4 = new Moto();
    		        m4.nome = "XRE 300";
    		        m4.marca = "Honda";
    		        m4.ano = 2022;
    		        m4.vel = 100;
    		        m4.acelerar(25);
    		        System.out.println("Velocidade: " + m4.vel + " KM");
    		        m4.freiar(20);
    		        System.out.println("Velocidade Apos Freio: " + m4.vel + " km");
    		        m4.buzinar();
    		        break;

    		    case 5:
    		        Moto m5 = new Moto();
    		        m5.nome = "Lander 250";
    		        m5.marca = "Yamaha";
    		        m5.ano = 2021;
    		        m5.vel = 95;
    		        m5.acelerar(22);
    		        System.out.println("Velocidade: " + m5.vel + " KM");
    		        m5.freiar(18);
    		        System.out.println("Velocidade Apos Freio: " + m5.vel + " km");
    		        m5.buzinar();
    		        break;

    		    case 6:
    		        Moto m6 = new Moto();
    		        m6.nome = "CB 500";
    		        m6.marca = "Honda";
    		        m6.ano = 2019;
    		        m6.vel = 105;
    		        m6.acelerar(30);
    		        System.out.println("Velocidade: " + m6.vel + " KM");
    		        m6.freiar(25);
    		        System.out.println("Velocidade Apos Freio: " + m6.vel + " km");
    		        m6.buzinar();
    		        break;

    		    case 7:
    		        Moto m7 = new Moto();
    		        m7.nome = "MT-03";
    		        m7.marca = "Yamaha";
    		        m7.ano = 2020;
    		        m7.vel = 95;
    		        m7.acelerar(28);
    		        System.out.println("Velocidade: " + m7.vel + " KM");
    		        m7.freiar(20);
    		        System.out.println("Velocidade Apos Freio: " + m7.vel + " km");
    		        m7.buzinar();
    		        break;

    		    case 8:
    		        Moto m8 = new Moto();
    		        m8.nome = "G 310R";
    		        m8.marca = "BMW";
    		        m8.ano = 2021;
    		        m8.vel = 90;
    		        m8.acelerar(26);
    		        System.out.println("Velocidade: " + m8.vel + " KM");
    		        m8.freiar(22);
    		        System.out.println("Velocidade Apos Freio: " + m8.vel + " km");
    		        m8.buzinar();
    		        break;

    		    case 9:
    		        Moto m9 = new Moto();
    		        m9.nome = "Z400";
    		        m9.marca = "Kawasaki";
    		        m9.ano = 2022;
    		        m9.vel = 110;
    		        m9.acelerar(35);
    		        System.out.println("Velocidade: " + m9.vel + " KM");
    		        m9.freiar(30);
    		        System.out.println("Velocidade Apos Freio: " + m9.vel + " km");
    		        m9.buzinar();
    		        break;

    		    case 10:
    		        Moto m10 = new Moto();
    		        m10.nome = "GSR 750";
    		        m10.marca = "Suzuki";
    		        m10.ano = 2019;
    		        m10.vel = 100;
    		        m10.acelerar(32);
    		        System.out.println("Velocidade: " + m10.vel + " KM");
    		        m10.freiar(28);
    		        System.out.println("Velocidade Apos Freio: " + m10.vel + " km");
    		        m10.buzinar();
    		        break;

    		    default:
    		        System.out.println("Opção inválida.");
    		        break;
    		}
    		break;
    	case 2:
    		System.out.println("Qual caminhão você quer escolher?\n 1- Scania R500\n  2- Volvo FH16\n  3- Mercedes-Benz Actros\n  4- Iveco Tector\n  5- Ford Cargo\n  6- MAN TGX\n  7- DAF XF\n  8- Volkswagen Constellation\n  9- Renault Magnum\n  10- Freightliner Cascadia");
    		int escolhaCaminhao = sc.nextInt();

    		switch (escolhaCaminhao) {
    		    case 1:
    		        Caminhao cam1 = new Caminhao();
    		        cam1.nome = "R500";
    		        cam1.marca = "Scania";
    		        cam1.ano = 2019;
    		        cam1.vel = 90;
    		        cam1.acelerar(25);
    		        System.out.println("Velocidade: " + cam1.vel + " KM");
    		        cam1.freiar(20);
    		        System.out.println("Velocidade Apos Freio: " + cam1.vel + " km");
    		        cam1.buzinar();
    		        break;

    		    case 2:
    		        Caminhao cam2 = new Caminhao();
    		        cam2.nome = "FH16";
    		        cam2.marca = "Volvo";
    		        cam2.ano = 2020;
    		        cam2.vel = 85;
    		        cam2.acelerar(30);
    		        System.out.println("Velocidade: " + cam2.vel + " KM");
    		        cam2.freiar(25);
    		        System.out.println("Velocidade Apos Freio: " + cam2.vel + " km");
    		        cam2.buzinar();
    		        break;

    		    case 3:
    		        Caminhao cam3 = new Caminhao();
    		        cam3.nome = "Actros";
    		        cam3.marca = "Mercedes-Benz";
    		        cam3.ano = 2018;
    		        cam3.vel = 80;
    		        cam3.acelerar(28);
    		        System.out.println("Velocidade: " + cam3.vel + " KM");
    		        cam3.freiar(18);
    		        System.out.println("Velocidade Apos Freio: " + cam3.vel + " km");
    		        cam3.buzinar();
    		        break;

    		    case 4:
    		        Caminhao cam4 = new Caminhao();
    		        cam4.nome = "Tector";
    		        cam4.marca = "Iveco";
    		        cam4.ano = 2017;
    		        cam4.vel = 75;
    		        cam4.acelerar(20);
    		        System.out.println("Velocidade: " + cam4.vel + " KM");
    		        cam4.freiar(15);
    		        System.out.println("Velocidade Apos Freio: " + cam4.vel + " km");
    		        cam4.buzinar();
    		        break;

    		    case 5:
    		        Caminhao cam5 = new Caminhao();
    		        cam5.nome = "Cargo";
    		        cam5.marca = "Ford";
    		        cam5.ano = 2016;
    		        cam5.vel = 70;
    		        cam5.acelerar(22);
    		        System.out.println("Velocidade: " + cam5.vel + " KM");
    		        cam5.freiar(17);
    		        System.out.println("Velocidade Apos Freio: " + cam5.vel + " km");
    		        cam5.buzinar();
    		        break;

    		    case 6:
    		        Caminhao cam6 = new Caminhao();
    		        cam6.nome = "TGX";
    		        cam6.marca = "MAN";
    		        cam6.ano = 2021;
    		        cam6.vel = 88;
    		        cam6.acelerar(27);
    		        System.out.println("Velocidade: " + cam6.vel + " KM");
    		        cam6.freiar(23);
    		        System.out.println("Velocidade Apos Freio: " + cam6.vel + " km");
    		        cam6.buzinar();
    		        break;

    		    case 7:
    		        Caminhao cam7 = new Caminhao();
    		        cam7.nome = "XF";
    		        cam7.marca = "DAF";
    		        cam7.ano = 2019;
    		        cam7.vel = 85;
    		        cam7.acelerar(26);
    		        System.out.println("Velocidade: " + cam7.vel + " KM");
    		        cam7.freiar(20);
    		        System.out.println("Velocidade Apos Freio: " + cam7.vel + " km");
    		        cam7.buzinar();
    		        break;

    		    case 8:
    		        Caminhao cam8 = new Caminhao();
    		        cam8.nome = "Constellation";
    		        cam8.marca = "Volkswagen";
    		        cam8.ano = 2018;
    		        cam8.vel = 78;
    		        cam8.acelerar(24);
    		        System.out.println("Velocidade: " + cam8.vel + " KM");
    		        cam8.freiar(19);
    		        System.out.println("Velocidade Apos Freio: " + cam8.vel + " km");
    		        cam8.buzinar();
    		        break;

    		    case 9:
    		        Caminhao cam9 = new Caminhao();
    		        cam9.nome = "Magnum";
    		        cam9.marca = "Renault";
    		        cam9.ano = 2017;
    		        cam9.vel = 80;
    		        cam9.acelerar(23);
    		        System.out.println("Velocidade: " + cam9.vel + " KM");
    		        cam9.freiar(18);
    		        System.out.println("Velocidade Apos Freio: " + cam9.vel + " km");
    		        cam9.buzinar();
    		        break;

    		    case 10:
    		        Caminhao cam10 = new Caminhao();
    		        cam10.nome = "Cascadia";
    		        cam10.marca = "Freightliner";
    		        cam10.ano = 2020;
    		        cam10.vel = 90;
    		        cam10.acelerar(29);
    		        System.out.println("Velocidade: " + cam10.vel + " KM");
    		        cam10.freiar(25);
    		        System.out.println("Velocidade Apos Freio: " + cam10.vel + " km");
    		        cam10.buzinar();
    		        break;

    		    default:
    		        System.out.println("Opção inválida.");
    		        break;
    		}
    		break;

    		
    	}
    	

    	
     
    }
    
       
    
}
