/*
 *@author Valerio
 */

package JavaT2.Aulas2;

import java.util.Scanner;

public class Modotexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        String line;
        System.out.println("insira uma frase:");
        line = scanner.nextLine();
        System.out.println(line);
        System.out.println("insira um numero:");
        num = scanner.nextInt();
        System.out.println(num);
    }
}
