package examples.desafio;

import java.util.Arrays;
import java.util.List;

public class númerospares {

	public static void main(String[] args) {
//		Desafio 2 - Imprima a soma dos números pares da lista:
//			Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
		
		 List<Integer> numero = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		 
		 int numerosPares = numero.stream()
				 .filter(n -> n % 2 == 0)
				 .mapToInt(Integer::intValue)
				 .sum();
		 
		 System.out.println("soma dos numeros pares da lista "+ numerosPares );
		 
				 
	}
}
