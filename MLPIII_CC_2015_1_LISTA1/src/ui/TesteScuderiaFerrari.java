package ui;
import java.util.Scanner;

import lista1.Carro;

public class TesteScuderiaFerrari {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("informe o modelo, a cor e a velocidade máxima do veiculo");
		Carro f1 = new Carro(in.nextLine(),in.nextLine(),in.nextInt());
		//imprimindo informações na tela
		System.out.println("Ligando o carro...");
		f1.ligar();
		System.out.println("Informe uma velocidade para acelerar");
		f1.acelerar(in.nextInt());
		System.out.println(f1);
		System.out.println("Desligando o carro...");
		f1.desligar();

	}

}
