package casa.com.desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DesafioUm {

	static Scanner scanner = new Scanner(System.in);

	public static void desafio(Integer valor) {

		if (valor <= 0) {
			throw new IllegalArgumentException("Insira um valor maior que Zero");
		}

		List<Integer> pares = new ArrayList<Integer>();
		List<Integer> impares = new ArrayList<Integer>();
		List<Integer> valores = new ArrayList<>();

		System.out.println("Insira os valores");

		for (int i = 0; i < valor; i++) {
			int numero = scanner.nextInt();
			valores.add(numero);
		}

		valores.forEach(val -> {
			if (val % 2 == 0) {
				pares.add(val);
			} else {
				impares.add(val);
			}
		});

		Collections.sort(pares);
		for (int i = 0; i < pares.size(); i++) {
			System.out.println(pares.get(i));
		}

		Collections.sort(impares, Collections.reverseOrder());

		for (int i = 0; i < impares.size(); i++) {
			System.out.println(impares.get(i));
		}
		scanner.close();
	}

	public static void main(String[] args) {
		System.out.println("Insira o tamanho da lista");

		try {
			Integer tamanho = scanner.nextInt();
			desafio(tamanho);
		} catch (InputMismatchException e) {
			throw new InputMismatchException("Insira um número válido");
		}
	}

}
