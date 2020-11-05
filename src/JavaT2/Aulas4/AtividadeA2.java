/*
 *@author Valerio
 */

package JavaT2.Aulas4;

import java.util.Scanner;

public class AtividadeA2 {
	public static void main(String[] args) {
		int num1,num2,num3;
		System.out.println("insira o 1º numero");
		num1 = new Scanner(System.in).nextInt();
		System.out.println("insira o 2º numero");
		num2 = new Scanner(System.in).nextInt();
		System.out.println("insira o 3º numero");
		num3 = new Scanner(System.in).nextInt();
		System.out.println("soma: " + (num1+num2+num3));
		System.out.println("produto: " + (num1*num2*num3));
	}
}
