package lista1;

public class Data {
	private int dia;
	private int mes;
	private int ano;

	public Data() {
		this(0, 0, 0);
	}

	public Data(int dia, int mes, int ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia > 0 && dia < 32)
			this.dia = dia;
		else
			this.dia = 1;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes > 0 && mes < 13)
			this.mes = mes;
		else
			this.mes = 1;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano > 0)
			this.ano = ano;
		else
			this.ano = 2000;
	}

	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

}
