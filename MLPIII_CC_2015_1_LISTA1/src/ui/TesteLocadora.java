package ui;
import java.util.Scanner;

import lista1.Fita;
import lista1.FitaInfantil;
import lista1.FitaLancamento;
import lista1.Locadora;

public class TesteLocadora {
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		Locadora lc = new Locadora("Locadora 1");
		System.out.println("Teste Locadora");
		System.out.println("Alugando um filme infantil...");
		System.out.println("Digite um nome e o preco da locação");
		
		Fita filme = new FitaInfantil(in.next(),in.nextFloat());
		lc.setFilme(filme);
		System.out.println(lc);
		System.out.println("Alugando um filme lançamento");
		System.out.println("Digite um nome e o preco da locação");
		filme = new FitaLancamento(in.next(),in.nextFloat());
		lc.setFilme(filme);
		System.out.println(lc);
		
		
		
		
	}

}
