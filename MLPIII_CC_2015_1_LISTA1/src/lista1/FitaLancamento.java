package lista1;

public class FitaLancamento extends Fita {

	public FitaLancamento(String titulo, float preco) {
		super(titulo, preco + (preco * (0.20f)));
	}

	@Override
	public void setPreco(float preco) {
		this.preco = preco + (preco * (0.20f));
	}

	@Override
	public String toString() {
		return "\nfita de lan�amento\ntitulo: " + this.titulo
				+ "\nPreco da loca��o com acrescimo de 20%: R$ " + this.preco;
	}
}
