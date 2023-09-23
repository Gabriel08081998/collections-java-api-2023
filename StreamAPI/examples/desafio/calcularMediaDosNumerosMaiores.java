package examples.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class calcularMediaDosNumerosMaiores {

	public static void main(String[] args) {
		//Desafio 5 - Calcule a média dos números maiores que 5:Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		OptionalDouble numerosMaiores = numeros.stream()
				.filter(n -> n >5)
				.mapToInt(Integer::intValue )
				.average();
		
		System.out.println("Os numeros maiores que 5 sao: "+ numerosMaiores);
		
		
	}
}
