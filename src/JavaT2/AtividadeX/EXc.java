/*
 *@author Valerio
 */

package JavaT2.AtividadeX;

import java.util.Scanner;

public class EXc {
	public static void main(String[] args) {
		System.out.println("Insira o seu nome:");
		String nome = new Scanner(System.in).nextLine();
		System.out.println("Insira o seu género [M/f]:");
		char gen = new Scanner(System.in).nextLine().charAt(0);
		System.out.println("Insira a sua idade:");
		int idade = new Scanner(System.in).nextInt();
		System.out.println("Insira a sua nota:");
		float nota = new Scanner(System.in).nextFloat();
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
		if (idade < 18){
			System.out.println("menor");
		}else System.out.println("maior");

		if (nota < 50){
			System.out.println("aprovado");
		}else System.out.println("reprovado");
	}
}
