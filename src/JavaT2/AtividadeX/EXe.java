/*
 *@author Valerio
 */

package JavaT2.AtividadeX;

import java.util.Scanner;

public class EXe {
	public static void main(String[] args) {
		boolean primo = false;
		do {
			System.out.println("insira um numero primo");
			int num = new Scanner(System.in).nextInt();
			int c = 0;
			for (int i = num; i >= 1 ; i--) {
				if (num % i == 0) {
					c++;
				}
			}
			if(c == 2) primo = true;
		}while(!primo);
		System.out.println("primo");
	}
}
