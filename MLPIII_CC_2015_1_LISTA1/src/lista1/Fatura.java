package lista1;
public class Fatura {
	private String numero;
	private String discricao;
	private int qtdItem;
	private double precoItem;

	public Fatura(String numero,String discricao,int qtdItem,double precoItem ){
		this.numero = numero;
		this.discricao = discricao;
		setPrecoItem(precoItem);
		this.qtdItem = qtdItem;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setDiscricao(String discricao) {
		this.discricao = discricao;
	}
	
	public String getDiscricao() {
		return discricao;
	}

	public int getQtdItem() {
		return qtdItem;
	}

	public void setQtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		if (precoItem > 0)
			this.precoItem = precoItem;
	}

	public double getValorFatura() {
		double valor = this.qtdItem * this.precoItem;
		if (valor < 0)
			valor = 0;
		return valor;
	}

	@Override
	public String toString() {
		String info;
		info = "Numero: "+this.numero+"\ndiscricao: "+this.discricao
				+"\nQuantidade: "+this.qtdItem +"\nValor de cada produto: "+this.precoItem
				+"\nTotal da Fatura: "+this.getValorFatura();
		return info;
	}
	
}
