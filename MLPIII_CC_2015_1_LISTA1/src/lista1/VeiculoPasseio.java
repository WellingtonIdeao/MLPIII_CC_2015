package lista1;

public class VeiculoPasseio extends Veiculo {
	private boolean arCondicionado;
	private byte qtdPorta;

	public VeiculoPasseio(int kmInicial, int kmFinal, int valorKmRodado) {
		super(kmInicial, kmFinal, valorKmRodado);

	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public byte getQtdPorta() {
		return qtdPorta;
	}

	public void setQtdPorta(byte qtdPorta) {
		this.qtdPorta = qtdPorta;
	}

	@Override
	public String toString() {
		return "Ve�culo de passeio\n" + "Valor da Loca��o: R$ "
				+ this.valorLocacao;
	}

}
