import java.util.function.UnaryOperator;

public class Aula1 {

	public static void main(String[] args) {
		UnaryOperator<Integer> calcularValorVezesTrinca = valor -> valor*3;
		int valor = 10;
		System.out.println("Resultado " + calcularValorVezesTrinca.apply(10));
	}

}
