/*
 *@author Valerio
 */

package JavaT2.Aulas6.Sessao4;

import java.util.Scanner;

public class AtividadeA1c {
	public static void main(String[] args) {
		System.out.println("insira o primero numero");
		int n1 = new Scanner(System.in).nextInt();
		System.out.println("insira o segundo numero");
		int n2 = new Scanner(System.in).nextInt();
		System.out.println("insira o terceiro numero");
		int n3 = new Scanner(System.in).nextInt();
		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println("o maior é " + n1);
			} else System.out.println("o maior é " + n3);

		} else if (n2 > n1) {
			if (n2 > n3) {
				System.out.println("o maior é " + n2);
			} else
				System.out.println("o maior é " + n3);
		}else if (n3 > n1){
			if (n3 > n2){
				System.out.println("o maior é " + n3);
			}else System.out.println("o maior é " + n2);
		}else System.out.println("o maior é " + n1);
	}
}