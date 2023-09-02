package senaiprojetos;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*
		 * Crie um array de inteiros com 5 elementos e preencha-o com valores fornecidos
		 * pelo usuário. Em seguida, imprima os valores do array.
		 */

		int[] fornecidosPeloUsuario = new int[5];

		Scanner valores = new Scanner(System.in);
		System.out.println("Digite 5 valores para preencher o array");

		for (int i = 0; i < fornecidosPeloUsuario.length; i++) {
			fornecidosPeloUsuario[i] = valores.nextInt();
		}

		for (int i = 0; i < fornecidosPeloUsuario.length; i++) {
			System.out.println("-----------------------------------");
			System.out.println(fornecidosPeloUsuario[i]);
		}
		valores.close();
	}

}
