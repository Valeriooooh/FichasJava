/*
 *@author Valerio
 */

package JavaT2.AtividadeX;

public class EXi {
	public static void main(String[] args) {
		int [] tabela = {1, 4, 25, 3, 0, 7, 8, 6, 97, 322};
		int max = 0, min = tabela[0];
		for (int value: tabela)
		{
			if (value > max)
			{
				max = value;
			}
			if (value < min)
			{
				min = value;
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
