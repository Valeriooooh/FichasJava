/*
 *@author Valerio
 */

package JavaT2.Aulas6.Sessao4;

import java.util.Scanner;

public class AtividadeA1a {
	public static void main(String[] args) {
		System.out.println("insira o primero numero");
		int n1 = new Scanner(System.in).nextInt();
		System.out.println("insira o segundo numero");
		int n2 = new Scanner(System.in).nextInt();
		if (n1 < n2){
			System.out.println(n1 + " < " + n2);
		}else if (n2 < n1){
			System.out.println(n1 + " > " + n2);
		}else System.out.println(n1 + " = " + n2);
	}
}