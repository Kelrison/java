package kelrison_java.src;
import java.util.Scanner;
import kelrison_java.src.entities.Professor;

public class Atividade15 {
    public static void main (String [] args){

        Scanner leitor = new Scanner(System.in);

        System.out.printf("Informe o nome do professor:");
        String nome = leitor.nextLine();
        

        System.out.printf("Informe a idade do professor:");
        int idade = leitor.nextInt();
        leitor.nextLine();

        System.out.printf("Informe a área de atuação:");
        String area = leitor.nextLine();

        Professor instrutor = new Professor(nome,idade,area);

        instrutor.exibirDados();
        

    }

}
