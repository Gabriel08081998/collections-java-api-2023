package examples.desafio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class maiorNumerosDaLista {

	public static void main(String[] args) {
		//Desafio 7 - Encontrar o segundo número maior da lista:Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
		
		Integer segundoMaior = numeros.stream()
                .distinct()  // Remova duplicatas
                .sorted(Comparator.reverseOrder())  // Ordene em ordem decrescente
                .skip(1)  // Pule o primeiro (maior) número
                .findFirst()  // Encontre o segundo número maior
                .orElse(null);  // Pode não haver segundo número maior

        if (segundoMaior != null) {
            System.out.println("O segundo número maior na lista é: " + segundoMaior);
        } else {
            System.out.println("Não há segundo número maior na lista.");
		}
		
				

	}

}
