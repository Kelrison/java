package kelrison_java.src;
import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        int numero1, numero2, soma;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe o primeiro número:");
    numero1 = leitor.nextInt();

    System.out.println("Informe o segundo número:");
    numero2 = leitor.nextInt();

    soma = numero1 + numero2;
    System.out.println("A soma é: " + soma);

    leitor.close();

    }
    
}