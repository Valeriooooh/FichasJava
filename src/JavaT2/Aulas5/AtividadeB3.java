/*
 *@author Valerio
 */

package JavaT2.Aulas5;
import java.util.Scanner;


public class AtividadeB3 {
	public static void main(String[] args) {
		//inicio
		System.out.println("\t\tJogo do adivinha");
		System.out.println("regras:\n insira um numero de 1 a 100 e de seguida veja se o numero é superior ou inferior ao inserido. De seguida corrija o numero.\n As suas tentativas serão contadas\n\t\tBoa Sorte!!!");
		System.out.println("Continuar? : [S/n]");
		// menu de escolha
		char enter = new Scanner(System.in).nextLine().charAt(0);
		while (enter != 's' && enter != 'S') {
			if (enter == 'n' || enter == 'N') System.exit(0);
			System.out.println("Opção incorreta\n Continuar? : [S/n]");
			enter = new Scanner(System.in).nextLine().charAt(0);
		}
		//inicio do jogo
		char outra = 's';
		while (outra == 's' || outra == 'S') {
			int random = (int) (Math.random() * (100));
			System.out.println("O número foi gerado, insira o seu palpite");
			int	palp = 0;
			try {
				palp = new Scanner(System.in).nextInt();
			} catch (Exception e) {
				System.out.println("Não é um numero");
				System.out.println("Adeus!");
				System.exit(0);
			}
			int c = 0;
			while(true){
				c++;
				if (palp == random) {
					System.out.println("Parabéns, Ganhou!!!");
					break;
				}

				if ((random - palp) < 0){
					if ((random - palp) < - 20){
						System.out.println("Muito alto");
					}else	System.out.println("Alto");
				}
				if ((random - palp) > 0) {
					if ((random - palp) > 20) {
						System.out.println("Muito Baixo");
					} else System.out.println("Baixo");
				}

				palp = new Scanner(System.in).nextInt();
			}
			//jogar outra vez
			System.out.println("deu "+ c +" palpites");
			System.out.println("pretende Jogar novamente [S/n]");
			outra = new Scanner(System.in).nextLine().charAt(0);
			while(outra != 's' && outra != 'S'){
				if (outra == 'n' || outra == 'N') {
					System.out.println("Adeus!");
					System.exit(0);
				}else{
					System.out.println("Opção incorreta\n Continuar? : [S/n]");
					outra = new Scanner(System.in).nextLine().charAt(0);
			}
			}

		}
	}
}
