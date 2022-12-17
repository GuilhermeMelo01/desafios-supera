package desafio2;

import java.io.IOException;
import java.util.Scanner;

public class NotasMoedas {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        String linha = in.next();
        String [] dinheiro = linha.split("\\.");
        int notas = Integer.parseInt(dinheiro[0]);
        int moedas = Integer.parseInt(dinheiro[1]);

        int restoNotas = 0;

        int notasCem = notas/100;
        restoNotas = (notas-notasCem*100);
        int notasCinquenta = restoNotas/50;
        restoNotas -= notasCinquenta*50;
        int notasVinte = restoNotas/20;
        restoNotas -= notasVinte*20;
        int notasDez = restoNotas/10;
        restoNotas -= notasDez*10;
        int notasCinco = restoNotas/5;
        restoNotas -= notasCinco*5;
        int notasDois = restoNotas/2;
        restoNotas -= notasDois*2;
        int notasUm = restoNotas;

        int restoMoedas = 0;

        int moedasCinquenta = moedas/50;
        restoMoedas = (moedas-moedasCinquenta*50);
        int moedasVinteECinco = restoMoedas/25;
        restoMoedas -= moedasVinteECinco*25;
        int moedasDez = restoMoedas/10;
        restoMoedas -= moedasDez*10;
        int moedasCinco = restoMoedas/5;
        restoMoedas -= moedasCinco*5;
        int moedasUm = restoMoedas;

        StringBuilder sb = new StringBuilder();
        sb.append("NOTAS:\n")
                .append(notasCem).append(" nota(s) de R$ 100.00\n")
                .append(notasCinquenta).append(" nota(s) de R$ 50.00\n")
                .append(notasVinte).append(" nota(s) de R$ 20.00\n")
                .append(notasDez).append(" nota(s) de R$ 10.00\n")
                .append(notasCinco).append(" nota(s) de R$ 5.00\n")
                .append(notasDois).append(" nota(s) de R$ 2.00\n")
                .append("MOEDAS:\n")
                .append(notasUm).append(" moeda(s) de R$ 1.00\n")
                .append(moedasCinquenta).append(" moeda(s) de R$ 0.50\n")
                .append(moedasVinteECinco).append(" moeda(s) de R$ 0.25\n")
                .append(moedasDez).append(" moeda(s) de R$ 0.10\n")
                .append(moedasCinco).append(" moeda(s) de R$ 0.05\n")
                .append(moedasUm).append(" moeda(s) de R$ 0.01");

        System.out.println(sb);
    }
}
