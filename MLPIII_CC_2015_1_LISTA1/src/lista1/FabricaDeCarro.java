package lista1;

public final class FabricaDeCarro {
	private static FabricaDeCarro instancia =null;
	private String nome;
	private int id;
	
	// esconde o contrutor/ garante que só a classe pode criar um objeto da mesma
	private FabricaDeCarro(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	
	// metodo que limita existir apenas uma instancia dessa classe
	// E retornar a referencia do unico objeto instanciado dessa classe
	public static synchronized FabricaDeCarro getInstance(String nome, int id) {
		if (instancia == null)
			instancia = new FabricaDeCarro(nome,id);
		return instancia;
	}

	@Override
	public String toString() {
		String str = "Nome da fabrica: "+this.nome+"\nId: "+this.id;
		return str;
	}

}
