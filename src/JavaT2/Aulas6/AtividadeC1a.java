/*
 *@author Valerio
 */

package JavaT2.Aulas6;

import java.util.Scanner;

public class AtividadeC1a {
	public static void main(String[] args) {
		System.out.println("insira o seu genero: [M/f] ");
		char gen = new Scanner(System.in).nextLine().charAt(0);
		switch (gen) {
			case 'm', 'M'   -> System.out.println("Masculino");
			case 'f', 'F'   -> System.out.println("Feminino");
			default         -> System.out.println("Opção Inválida");
		}

	}
}
