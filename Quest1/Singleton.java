package Quest1;

public class Singleton {
	private static Singleton instancia = null;

	protected Singleton() {
	}

	public static Singleton getInstancia() {
		if (instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}