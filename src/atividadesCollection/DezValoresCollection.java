package atividadesCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class DezValoresCollection {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		HashSet<Integer> numeros = new HashSet<>();

		System.out.println("--- DIGITE 10 VALORES INTEIROS NÃO REPETIDOS ---\n");

		while (numeros.size() < 10) {
			System.out.print("Digite um número: ");
			int numero = leia.nextInt();

			if (!numeros.add(numero)) {
				System.out.println("Número repetido! Tente novamente.");
			}
		}

		System.out.println("\nNúmeros digitados:");
		Iterator<Integer> iterator = numeros.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		leia.close();
	}
}
