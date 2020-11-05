/*
 *@author Valerio
 */

package JavaT2.Aulas6;

import java.util.Scanner;

public class AtividadeD1a {
	public static void main(String[] args) {
		System.out.println("insira um numero para mostrar a sua tabuada:");
		int n = new Scanner(System.in).nextInt();
		for (int i = 1; i < 13; i++) {
			System.out.println( n + " x " + i + " = " + (n*i));
		}
	}
}
