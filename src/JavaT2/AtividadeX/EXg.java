/*
 *@author Valerio
 */

package JavaT2.AtividadeX;

public class EXg {
	public static void main(String[] args) {
		int [] tabela = {1, 4, 25, 3, 25, 7, 8, 6, 97, 322};
		float res = 0;
		for (int value: tabela)
		{
			res+=value;
		}
		res/=10;
		System.out.println(res);
	}
}
