import java.util.function.BiPredicate;

public class FuncoesPuras {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> verfificarSeEMaior = 
				(parametro, valorComparacao) -> parametro > valorComparacao;
				
		System.out.println(verfificarSeEMaior.test(13, 12));
		System.out.println(verfificarSeEMaior.test(13, 12));
	}

}
