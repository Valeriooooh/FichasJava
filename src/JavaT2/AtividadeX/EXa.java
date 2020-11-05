/*
 *@author Valerio
 */

package JavaT2.AtividadeX;

import java.util.Scanner;

public class EXa {
	public static void main(String[] args) {
		System.out.println("Calculadora de Formula Resolvente\n");
		System.out.println("Insira o valor de a:");
		double a = new Scanner(System.in).nextDouble();
		System.out.println("Insira o valor de b:");
		double b = new Scanner(System.in).nextDouble();
		System.out.println("Insira o valor de c:");
		double c = new Scanner(System.in).nextDouble();
		double delta = (b*b) - 4 * a * c;
		System.out.println(delta);
		if (delta < 0) {
			System.out.println("Complexo");
		}else if (delta == 0) {
			double res = (-b + Math.sqrt(delta))/(2 * a);
			System.out.println("x = " + res);
		}else {
			double res1 = ( 0 - b + Math.sqrt(delta))/(2 * a);
			double res2 = ( 0 - b - Math.sqrt(delta))/(2 * a);
			System.out.println("x = " + res1);
			System.out.println("x = " + res2);
		}
	}
}
