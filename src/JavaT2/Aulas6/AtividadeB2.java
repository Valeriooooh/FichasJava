/*
 *@author Valerio
 */

package JavaT2.Aulas6;

import java.util.Scanner;

public class AtividadeB2 {
	public static void main(String[] args) {
		System.out.println("insira o primero numero");
		int n1 = new Scanner(System.in).nextInt();
		System.out.println("insira o segundo numero");
		int n2 = new Scanner(System.in).nextInt();
		String res = (n1 == n2) ? (n1 + " = " + n2) : ( (n1 < n2) ? (n1 + " < " + n2) : (n1 + " > " + n2));
		System.out.println(res);
	}
}
