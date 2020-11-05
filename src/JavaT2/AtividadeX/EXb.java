/*
 *@author Valerio
 */

package JavaT2.AtividadeX;

import java.util.Scanner;

public class EXb {
	public static void main(String[] args) {
		System.out.println("insira o seu nome:");
		String nome = new Scanner(System.in).nextLine();
		System.out.println("insira o seu género [M/f]:");
		char gen = new Scanner(System.in).nextLine().charAt(0);
		switch (gen){
			case 'F', 'f' -> {
				System.out.print("Olá Sra. ");
				break;
			}
			case 'M', 'm' -> {
				System.out.print("Olá Sr. ");
				break;
			}
			default -> {
				System.out.println("valor incorreto");
				System.exit(0);
			}
		}
		System.out.println(nome);
	}
}
