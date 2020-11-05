/*
 *@author Valerio
 */

package JavaT2.Aulas6;

import java.util.Scanner;

public class AtividadeFa {
	public static void main(String[] args) {
		do {
			System.out.println("introduza o seu genero [M/f]: ");
			char gen = new Scanner(System.in).nextLine().charAt(0);
			switch (gen)
			{
				case 'M', 'm' -> {
					System.out.println("Masculino");
					System.exit(0);
				}
				case 'F', 'f' -> {
					System.out.println("Feminino");
					System.exit(0);
				}
				default -> System.out.println("Opção incorreta");

			}
			}while (true);
		}
	}

