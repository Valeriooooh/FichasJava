/*
 *@author Valerio
 */

package JavaT2.Aulas4;

import java.util.Scanner;

public class AtividadeA1 {
	public static void main(String[] args) {
		System.out.println("insira um valor para verificar se é par");
		int num = new Scanner(System.in).nextInt();
		int res = num % 2;
		if(res != 0){
			System.out.println("é impar e o resto é " + res);
		}else System.out.println("é par");
	}
}
