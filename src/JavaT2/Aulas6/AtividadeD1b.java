/*
 *@author Valerio
 */

package JavaT2.Aulas6;

public class AtividadeD1b {
	public static void main(String[] args) {
		for (int i = 1; i < 13; i++) {
			System.out.println("\n\nTabuada do " + i);
			for (int j = 1; j < 13; j++) {
				System.out.println("\t" + i + " x " + j + " = " + (j*i));
			}
		}
	}
}
