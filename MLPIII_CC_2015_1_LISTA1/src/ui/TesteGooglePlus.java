package ui;
import java.util.Scanner;
import lista1.Data;

public class TesteGooglePlus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Teste Google+ data...");
		System.out.println("Informe uma data no formato dd/mm/aa - apenas números");
		Data date = new Data(in.nextInt(),in.nextInt(),in.nextInt());
		System.out.println(date);
	}
}
