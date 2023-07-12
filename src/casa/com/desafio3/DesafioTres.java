package casa.com.desafio3;

import java.util.Scanner;

public class DesafioTres {

	static Scanner scan = new Scanner(System.in);

	public static void desafioTres(Integer n, Integer k) {
		if (n == 0) {
			throw new IllegalArgumentException();
		}
		Integer[] numeros = new Integer[n];
		int mod = 1;
		int r = 0;

		System.out.println("Insira os valores");

		for (int i = 1; i <= numeros.length; i++) {
			int valor = scan.nextInt();
			int resultado = (valor - mod);
			if (resultado == -k) {
				resultado *= -1;
			}

			if (resultado == k) {
				resultado = 1;
				r += resultado;
			}

			mod = valor;
		}
		System.out.println(r);
		scan.close();
	}

	public static void main(String[] args) {

		try {
			System.out.println("Insira o valor de n");
			Integer n = scan.nextInt();
			System.out.println("Insira o valor de k");
			Integer k = scan.nextInt();
			desafioTres(n, k);
		} catch (Exception e) {
			throw new IllegalArgumentException("Argumento inválido.");
		}

	}

}
