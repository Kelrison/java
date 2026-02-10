package kelrison_java.src;

import kelrison_java.src.entities.ConversaoMonetaria;
import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor em Dólares: ");
        double valorDolar = leitor.nextDouble();

        System.out.println("Digite a taxa de conversão para Reais: ");
        double taxaConversao = leitor.nextDouble();

        System.out.println("Digite a taxa do IOF (em %): ");
        double taxaIOF = leitor.nextDouble();

        double valorEmReais =
                ConversaoMonetaria.converter(valorDolar, taxaConversao, taxaIOF);

        System.out.println("O valor em Reais é: " + valorEmReais);
        leitor.close();
    }
}
