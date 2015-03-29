package ui;
import java.util.Scanner;

import lista1.DadosPagamento;

public class TesteDadosPagamento {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe os pagamentos embaralhados");
		DadosPagamento pg  = new DadosPagamento(in.next());
		System.out.println(pg);

	}

}
