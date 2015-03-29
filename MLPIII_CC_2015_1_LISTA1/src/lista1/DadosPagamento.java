package lista1;

public class DadosPagamento {
	private String str; // string com dados embaralhados
	private int Somapag;// valor total pagamento

	public DadosPagamento(String str) {
		this.str = str;
		calcularCustos();
	}

	// metódo acessível apenas pela classe
	// separa a letras dos salarios e soma-os
	private void calcularCustos() {
		String str = this.str.toLowerCase();
		String[] vetStrings = str.split("[a-z]");
		for (String v : vetStrings) {
			if (!v.contentEquals(""))
				Somapag += Integer.parseInt(v);
		}

	}

	// mostra informaçoes do custo
	@Override
	public String toString() {
		return "Custo de todos os salários " + this.Somapag;

	}

}
