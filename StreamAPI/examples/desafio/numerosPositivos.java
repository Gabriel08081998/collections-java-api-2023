package examples.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class numerosPositivos {
	public static void main(String[] args) {
//		Desafio 3 - Verifique se todos os números da lista são positivos:
//		Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
		List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, -6, 7, 8, 9, 10, -5, 4, 3);
		
		List<Integer> positivos = numeros.stream()
				.filter(numero -> numero > 0)
				.collect(Collectors.toList());
		
		List<Integer> negativo = numeros.stream()
				.filter(numero -> numero < 0)
				.collect(Collectors.toList());
		
		System.out.println("numeros positivos"+ positivos);
		System.out.println("numeros negativos"+ negativo);
		
	}

}
