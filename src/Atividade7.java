package kelrison_java.src;
import java.util.Scanner;

public class Atividade7{
    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);
        int repeticoes;

        System.out.println("Informe número de contagens:");
        repeticoes = leitor.nextInt();

        for (int contador = 0; contador < repeticoes; contador++){
            System.out.println("Número: "+ contador);
        }

        System.out.println("::::: Contagem Regressiva :::::");
        for (int contador = repeticoes; contador != 0; contador--){
            System.out.println("Número decrescente: " + contador);
        }
    leitor.close();
    }




}