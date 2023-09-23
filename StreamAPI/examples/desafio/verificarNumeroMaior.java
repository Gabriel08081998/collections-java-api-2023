package examples.desafio;

import java.util.Arrays;
import java.util.List;

public class verificarNumeroMaior {

	public static void main(String[] args) {
//Desafio 6 - Verificar se a lista contém algum número maior que 10:Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
		
		List<Integer> numeros =Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		List<Integer> numeroMaior = numeros.stream()
				.filter(n -> n > 4)
				.toList();
		
		if (!numeroMaior.isEmpty()) {
			System.out.println("numeros maiores que 10 "+numeroMaior);
		}else {
			System.out.println("Nao a numeros maiores que 10 na lista ");
		}
				
		
	}
}
