/*
 *@author Valerio
 */

package JavaT2.Aulas1;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LerComBuffer {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        System.out.println("indique o seu nome");
        String nome = reader.readLine();
        System.out.println("ola " + nome );
    }
}
