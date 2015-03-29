package lista1;

public class VeiculoCarga extends Veiculo {
	private int capacidadeCarga;

	public VeiculoCarga(int kmInicial, int kmFinal, int valorKmRodado) {
		super(kmInicial, kmFinal, valorKmRodado);
	}

	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	@Override
	public String toString() {
		return "Ve�culo de Carga\n" + "Valor da Loca��o: R$ "
				+ this.valorLocacao;
	}

}
