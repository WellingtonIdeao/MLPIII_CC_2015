package ui;
import java.util.Scanner;

import lista1.Fatura;

public class TesteFatura {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Loja de Informatica");
		System.out.println("Gerador de Fatura");
		System.out.println("digite o numero,a discricao do produto, a quantidade e o preço nessa ordem");
		Fatura fatu = new Fatura(in.nextLine(),in.nextLine(),in.nextInt(),in.nextDouble());
		System.out.println(fatu);
		
	}

}
