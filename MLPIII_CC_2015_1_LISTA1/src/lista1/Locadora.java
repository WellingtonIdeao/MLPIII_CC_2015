package lista1;

public class Locadora {
	private String nome;
	private Fita filme;
	
	public Locadora(String nome){
		this.nome = nome;	
	}

	public Fita getFilme() {
		return filme;
	}

	public void setFilme(Fita filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Locadora: "+this.nome+"\n"+this.filme;
	}
	
}
