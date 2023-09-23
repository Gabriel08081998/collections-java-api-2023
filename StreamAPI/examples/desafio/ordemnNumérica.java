package examples.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ordemnNumérica {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(2, 4, 6, 7, 8, 9, 10, 5, 3, 1 );
		
		List<Integer> ordemCrescente = numeros.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Numeros ordenados em ordem cresecente: " + ordemCrescente);
	}
}
