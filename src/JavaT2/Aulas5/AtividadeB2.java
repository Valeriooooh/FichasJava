/*
 *@author Valerio
 */

package JavaT2.Aulas5;

import java.util.Scanner;

public class AtividadeB2 {
	public static void main(String[] args) {
		System.out.println("insira o nome do aluno");
		String nome = new Scanner(System.in).nextLine();
		System.out.println("insira a nota do trabalho prático");
		float pratico   = (float) (new Scanner(System.in).nextFloat() * 0.5);
		System.out.println("insira a nota do teste");
		float teste     = (float) (new Scanner(System.in).nextFloat() * 0.3);
		System.out.println("insira a nota do relatorio trabalho prático");
		float relatorio = (float) (new Scanner(System.in).nextFloat() * 0.2);
		System.out.println("O aluno " + nome + " tem como nota final " + (pratico+teste+relatorio));
	}
}
