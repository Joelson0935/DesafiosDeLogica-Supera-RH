package casa.com.desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a quantidade de numeros");
		Integer num = scan.nextInt();
		Integer[] valor = new Integer[num];
		
		List<Integer> pares = new ArrayList<Integer>();
		List<Integer> impares = new ArrayList<Integer>();

		System.out.println("Insira os valores e em seguida aperte ENTER");
		for (int i = 0; i < valor.length; i++) {
			Integer numero = scan.nextInt();

			if (numero % 2 == 0) {
				pares.add(numero);
			} else {
				impares.add(numero);
			}
		}
		
		System.out.println("------------------------------------------------");

		Collections.sort(pares);
		for (int i = 0; i < pares.size(); i++) {
			System.out.println(pares.get(i));
		}

		Collections.sort(impares, Collections.reverseOrder());

		for (int i = 0; i < impares.size(); i++) {
			System.out.println(impares.get(i));
		}

		scan.close();
	}

}
