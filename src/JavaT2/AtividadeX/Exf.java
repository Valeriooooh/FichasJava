/*
 *@author Valerio
 */

package JavaT2.AtividadeX;

import java.util.Scanner;

public class Exf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira dois numeros");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		System.out.println("menu");
		System.out.println(" [+] - Somar\n" +
				" [-] - Subtrair\n" +
				" [x] - Multiplicar\n" +
				" [/] - Dividir\n" +
				"[--] - Sair\n");
		char op = scanner.nextLine().charAt(0);
		switch (op) {
			case '+' : {
				System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			}
			case '-' : {
				System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			}
			case 'x' : {
				System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
			}
			case '/' : {
				System.out.println(n1 + " ÷ " + n2 + " = " + (n1 / n2));
			}
			default  : {
				System.out.println("Adeus!");
			}
		}
	}
}
