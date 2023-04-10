
public class Aula {

	public static void main(String[] args) {
		Funcao1 funcao1 = valor -> "Hello World! " + valor;
		System.out.println(funcao1.gerar("Marco"));
	}

}

@FunctionalInterface
interface Funcao1 {
	String gerar (String valor);
}