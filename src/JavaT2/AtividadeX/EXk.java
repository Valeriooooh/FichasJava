/*
 *@author Valerio
 */

package JavaT2.AtividadeX;

import java.util.Scanner;

public class EXk
{
	public static void main(String[] args)
	{
		System.out.println("insira um numero");
		int n = new Scanner(System.in).nextInt();

		for (int i = 0; i <= n; i++)
		{
			int c = 0;
			for (int j = i; j > 0; j--)
			{
				if (i % j == 0)
				{
					c++;
				}
			}
		if (c == 2){
			System.out.println(i);
		}
		}
	}
}
