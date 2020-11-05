/*
 *@author Valerio
 */

package JavaT2.AtividadeX;

import java.util.Scanner;

public class EXj {
	public static void main(String[] args) {
		System.out.println("insira o num de tabuadas");
		int n1 = new Scanner(System.in).nextInt();
		for (int i = 1; i <= n1; i++) {
			System.out.println("\n\n");
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%d x %d = %d\n",j,i,j*i);
			}
		}
	}
}
