package kelrison_java.src;
import java.util.Scanner;

public class Atividade02{
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double pi = 3.14;
        double raio, area;
        System.out.println("Informe o valor do raio do círculo:");
        raio = leitor.nextDouble();
        area = pi * raio * raio;

        System.out.printf("A área do círculo é: %.2f%n", area);
        leitor.close();



    }
    }
