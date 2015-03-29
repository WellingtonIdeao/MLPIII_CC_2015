package ui;
import java.util.Scanner;

import lista1.Veiculo;
import lista1.VeiculoCarga;
import lista1.VeiculoPasseio;

public class TesteLocadoraVeiculo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Locadora de Veiculos");
		System.out.println("Locando um veiculo de Passeio...");
		System.out.println("Informe o km inicial,km final e o preço por km rodado");
		Veiculo veiculo = new VeiculoPasseio(in.nextInt(),in.nextInt(),in.nextInt());
		System.out.println(veiculo);
		System.out.println("Locando um veiculo de carga ...");
		System.out.println("Informe o km inicial,km final e o preço por km rodado");
		veiculo = new VeiculoCarga(in.nextInt(),in.nextInt(),in.nextInt());
		System.out.println(veiculo);
	}
}
