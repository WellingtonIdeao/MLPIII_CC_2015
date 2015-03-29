package lista1;

public class DadosPagamento {
	private String str; // string com dados embaralhados
	private int Somapag;// valor total pagamento

	public DadosPagamento(String str) {
		this.str = str;
		calcularCustos();
	}

	// met�do acess�vel apenas pela classe
	// separa a letras dos salarios e soma-os
	private void calcularCustos() {
		String str = this.str.toLowerCase();
		String[] vetStrings = str.split("[a-z]");
		for (String v : vetStrings) {
			if (!v.contentEquals(""))
				Somapag += Integer.parseInt(v);
		}

	}

	// mostra informa�oes do custo
	@Override
	public String toString() {
		return "Custo de todos os sal�rios " + this.Somapag;

	}

}
