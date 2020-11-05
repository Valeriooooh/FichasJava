/*
 *@author Valerio
 */

package JavaT2.AtividadeX;

import java.util.Scanner;

public class EXh {
	public static void main(String[] args) {
		System.out.println("insira um numero");
		int n1 = new Scanner(System.in).nextInt();
		for (int i = n1-1; i > 0; i--)
		{
			n1 *= i;
		}
		System.out.println(n1);
	}
}
