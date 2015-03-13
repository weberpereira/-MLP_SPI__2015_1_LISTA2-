package Quest3;

public class Google {
	private int dia;
	private int mes;
	private int ano;
	private boolean valida;

	public boolean isValida() {
		return valida;
	}

	public void setValida(boolean valida) {
		this.valida = valida;
	}

	public Google(int dia, int mes, int ano) {
		if (dia > 0 && dia <= 31 && mes > 0 && mes <= 12 && ano > 0) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
			this.setValida(true);
		} else
			System.out.println("Data Inválida.");
	}

	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano > 0)
			this.ano = ano;
		else
			System.out.println("ano invalido");
	}

}