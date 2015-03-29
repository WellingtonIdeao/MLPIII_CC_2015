package lista1;

public class FitaInfantil extends Fita {

	public FitaInfantil(String titulo, float preco) {
		super(titulo, preco - (preco * (0.40f)));
	}

	@Override
	public void setPreco(float preco) {
		this.preco = preco * (preco * (0.40f));
	}

	@Override
	public String toString() {
		return "\nfita infantil\ntitulo: " + this.titulo
				+ "\nPreco da locação com desconto de 40%: R$ " + this.preco;
	}

}
