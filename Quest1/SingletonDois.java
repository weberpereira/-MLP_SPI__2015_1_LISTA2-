package Quest1;

public class SingletonDois {
	public static void main(String[] args) {
		Singleton ford = Singleton.getInstancia();
		ford.setNome("FORD LTDA");
		System.out.println(ford.getNome());
	}
}