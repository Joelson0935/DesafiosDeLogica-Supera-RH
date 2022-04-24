package casa.com.desafio3;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Determine o tamanho do array");
		Integer n = scan.nextInt();
		System.out.println("Digite o valor alvo");
		Integer k = scan.nextInt();
		Integer[] numeros = new Integer[n];
		int mod = 1;
		int r = 0;
		for (int i = 1; i <= numeros.length; i++) {
			System.out.println("Valores: ");
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
		System.out.println("Resultado: " + r);

		scan.close();
	}

}
