/*
 *@author Valerio
 */

package JavaT2.AtividadeX;

import java.util.Scanner;

public class EXd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira dois numeros");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		System.out.println("menu");
		int op = scanner.nextInt();
		switch (op){
			case 1 -> {
				System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
				break;
			}
			case 2 -> {
				System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
				break;
			}
			case 3 -> {
				System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
				break;
			}
			case 4 -> {
				System.out.println(n1 + " ÷ " + n2 + " = " + (n1 / n2));
				break;
			}
			default -> {
				System.out.println("Adeus!");
			}
		}
	}
}
