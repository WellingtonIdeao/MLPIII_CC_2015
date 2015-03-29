package lista1;

public abstract class Fita {
	protected String titulo;
	protected float preco;
	
	public Fita(String titulo,float preco) {
		this.titulo = titulo;
		this.preco = preco;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	} 
	
	

	
	
}
