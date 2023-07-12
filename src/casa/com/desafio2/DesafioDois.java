package casa.com.desafio2;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDois {

	static Scanner scan = new Scanner(System.in);

	public static void desafioDois(Double valor) {

		Locale.setDefault(Locale.US);

		if (valor <= 0) {
			throw new IllegalArgumentException();
		}

		System.out.println("NOTAS:");

		Double n1 = (valor / 100);
		System.out.println(n1.intValue() + " nota (s) de R$ 100.00");
		valor %= 100;

		Double n2 = (valor / 50);
		System.out.println(n2.intValue() + " nota (s) de R$ 50.00");
		valor %= 50;

		Double n3 = (valor / 20);
		System.out.println(n3.intValue() + " nota (s) de R$ 20.00");
		valor %= 20;

		Double n4 = (valor / 10);
		System.out.println(n4.intValue() + " nota (s) de R$ 10.00");
		valor %= 10;

		Double n5 = (valor / 5);
		System.out.println(n5.intValue() + " nota (s) de R$ 5.00");
		valor %= 5;

		Double n6 = (valor / 2);
		System.out.println(n6.intValue() + " nota (s) de R$ 2.00");
		valor %= 2;

		System.out.println("MOEDAS:");

		Double n7 = (valor / 1);
		System.out.println(n7.intValue() + " moeda (s) de R$ 1.00");
		valor %= 1;

		Double n8 = (valor / 0.50);
		System.out.println(n8.intValue() + " moeda (s) de R$ 0.50");
		valor %= 0.50;

		Double n9 = (valor / 0.25);
		System.out.println(n9.intValue() + " moeda (s) de R$ 0.25");
		valor %= 0.25;

		Double n10 = (valor / 0.10);
		System.out.println(n10.intValue() + " moeda (s) de R$ 0.10");
		valor %= 0.10;

		Double n11 = (valor / 0.05);
		System.out.println(n11.intValue() + " moeda (s) de R$ 0.05");
		valor %= 0.05;

		if (valor < 0.05) {
			Double n12 = (valor / 0.01);
			System.out.println(n12.intValue() + " moeda (s) de R$ 0.01");
		}

		scan.close();

	}

	public static void main(String[] args) {

		System.out.println("Informe o Valor");

		try {
			Double valor = scan.nextDouble();
			desafioDois(valor);
		} catch (Exception e) {
			throw new IllegalArgumentException("Insira um valor válido.");
		}

	}

}
