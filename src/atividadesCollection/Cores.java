package atividadesCollection;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Cores {

	public static void main(String[] args) {

		int i;

		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("--- EXIBE CORES DIGITADAS PELO USUÁRIO ---\n");

		for (i = 1; i <= 5; i++) {
			System.out.printf("Escreva a %dª cor: ", i);
			String cor = leia.nextLine();
			cores.add(cor);
		}

		System.out.println("\nCORES DIGITADAS: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);

		System.out.println("\nCORES EM ORDEM CRESCENTE:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		leia.close();
	}
}
