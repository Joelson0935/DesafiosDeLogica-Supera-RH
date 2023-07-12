package casa.com.desafio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioQuatro {

	static Scanner leitor = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Insira a quantidade de frases");
		int N = leitor.nextInt();
		System.out.println("Insira a (s) frase (s) e aperte Enter");

		List<String> frases = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			String frase = readLine(leitor);
			if (frase.toCharArray().length >= 2 && frase.toCharArray().length <= 100) {
				frases.add(frase);
			} else {
				throw new IllegalArgumentException("Argumento inválido");
			}
		}

		frases.forEach(frase -> {
			StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
			StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
			parte1.reverse();
			parte2.reverse();
			System.out.println(parte1.toString() + parte2.toString());
		});
	}

	public static String readLine(Scanner leitor) {
		String line = leitor.nextLine();
		while (line.isEmpty())
			line = leitor.nextLine();
		return line;
	}
}
