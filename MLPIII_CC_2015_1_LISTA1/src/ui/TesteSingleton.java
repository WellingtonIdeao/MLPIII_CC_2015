package ui;

import lista1.FabricaDeCarro;

public class TesteSingleton {
	
	public static void main(String[] args) {
		 FabricaDeCarro fabrica = null;
	
		 System.out.println("criando um objeto Fabrica de Carro...");
		 fabrica = fabrica.getInstance("Ferrari",1);
		 
		 System.out.println("Informações do objeto");
		 System.out.println(fabrica);
   		 System.out.println("Tentando criar outro objeto...");
		 
		 fabrica = fabrica.getInstance("Williams",2);
		 System.out.println("Informações do objeto 2");
		 System.out.println(fabrica);
		 
	}
}
