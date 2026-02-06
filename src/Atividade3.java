package kelrison_java.src;
import java.util.Scanner;


public class Atividade3{
public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
    int numero;

    System.out.println("Informe um número inteiro:");
    numero = leitor.nextInt();

    if (numero > 0) {
        System.out.println("O número é positivo.");
    }else {
        System.out.println("O número é negativo");
    }
leitor.close();
    
}
}
    

    

