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
		return "Veículo de Carga\n" + "Valor da Locação: R$ "
				+ this.valorLocacao;
	}

}
