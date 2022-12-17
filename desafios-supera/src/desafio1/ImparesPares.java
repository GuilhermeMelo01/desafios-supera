package desafio1;

/*Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo

o seguinte critério:
- Primeiro os Pares
- Depois os Ímpares

Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
em ordem decrescente.

Entrada
A primeira linha de entrada contém um único inteiro positivo N (1 < N <= 105) Este é o
número de linhas de entrada que vem logo a seguir. As próximas N linhas conterão, cada
uma delas, um valor inteiro não negativo.

Saída
Apresente todos os valores lidos na entrada segundo a ordem apresentada acima. Cada
número deve ser impresso em uma linha, conforme exemplo abaixo.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ImparesPares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int entrada = in.nextInt();
        List<Integer> valores = new ArrayList<>();
        List<Integer> valorImpar = new ArrayList<>();
        List<Integer> valorPar = new ArrayList<>();


        while (entrada > 0) {
            int valor = in.nextInt();
            valores.add(valor);
            entrada--;
        }


        for (int i = 0; i < valores.size(); i++) {
            if (valores.get(i) % 2 == 0) {
                valorPar.add(valores.get(i));
            } else {
                valorImpar.add(valores.get(i));
            }
        }

        Collections.sort(valorPar);
        Collections.sort(valorImpar);
        Collections.reverse(valorImpar);

        for (Integer v : valorPar) {
            System.out.println(v);
        }

        for (Integer v : valorImpar) {
            System.out.println(v);
        }
    }
}
