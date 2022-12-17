package desafio4;

import java.io.IOException;
import java.util.Scanner;

public class DecifraFrase {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int entrada = in.nextInt();

        while (entrada >= 0) {
            StringBuilder sb = new StringBuilder();
            String frase = in.nextLine();
            for (int i = 0; i < frase.length() / 2; i++) {
                sb.append(frase.charAt(i));
            }
            sb.reverse();
            for (int j = frase.length()-1; j >= frase.length()/2; j--) {
                sb.append(frase.charAt(j));
            }
            System.out.println(sb);
            entrada--;
        }
    }
}
