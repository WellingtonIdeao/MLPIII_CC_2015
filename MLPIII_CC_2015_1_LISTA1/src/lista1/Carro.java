package lista1;

public class Carro {
	private String cor;
	private String modelo;
	private int velocAtual;
	private int velocMax;
	private boolean isLigado;
	// obrigat�rio informar o modelo, cor , e velocMax na cria��o do objeto 
	
	public Carro(String modelo, String cor, int velocMax){
		this.modelo = modelo;
		this.cor = cor;
		this.velocMax = velocMax;
	}
	
	public void ligar() {
		this.isLigado = true;
		System.out.println("Carro ligado");
	}

	public void desligar() {
		this.isLigado = false;
		System.out.println("Carro desligado");
	}

	public void acelerar(int velocidade) {
		if (isLigado) {
			int velocTotal = this.velocAtual + velocidade;
			if (velocTotal > this.velocMax) {
				System.out.println("Velocidade m�xima excedida!");
			} else
				this.velocAtual += velocidade;
		}
	}

	// metodos gets e sets
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocAtual() {
		return velocAtual;
	}

	public void setVelocAtual(int velocAtual) {
		this.velocAtual = velocAtual;
	}

	public int getVelocMax() {
		return velocMax;
	}

	public void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}
	
	@Override
	public String toString() {
		String str = "Carro\nModelo: "+this.modelo+"\nCor: "+this.cor+
			         "\nEst� Ligado? "+this.isLigado+"\nVelocidade Atual:  "+this.velocAtual+"\nVelocidade m�xima: "+this.velocMax;	
		return str;	
	}
	
}
