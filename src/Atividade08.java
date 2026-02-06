package kelrison_java.src;
import java.util.Scanner;

public class Atividade08{

    public static void main(String[]args){

        Scanner leitor = new Scanner(System.in);
        char resposta;
        
       
        do { 
            System.out.println("Informe um número:");
            int numero = leitor.nextInt();
            if (numero == 1){
                System.out.println("Bom dia");
            }else if(numero == 2){
                System.out.println("Boa tarde!");
            }else{
                System.out.println("Opção inválida!");
            }

            System.out.println("Deseja repetir? S - Sim ou N - Não");
            resposta = leitor.next().charAt(0);

        } while (resposta == 'S' || resposta == 's');
            
        leitor.close();

    }
}