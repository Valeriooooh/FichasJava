/*
 *@author Valerio
 */

package JavaT2.Aulas5;

import java.util.Scanner;

public class AtividadeB1 {
	public static void main(String[] args) {
		System.out.println("insira os valores dos lados do retangulo");
		float c = new Scanner(System.in).nextFloat();
		float l = new Scanner(System.in).nextFloat();
		System.out.println("area = " + c*l);
		System.out.println("perimetro = " + 2*(c+l));
	}
}
