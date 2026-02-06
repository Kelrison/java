package kelrison_java.src;
import java.util.Scanner;

public class Atividade4{
    public static void main(String[]args){
        int numero;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o número:");
        numero = leitor.nextInt();

        if (numero == 1){
            System.out.println("Bom dia");
        }else if(numero == 2){
            System.out.println("Boa tarde");
        }else if(numero == 3){
            System.out.println("Boa noite");
        }else{
            System.out.println("Inválido number");
        }
        leitor.close();

    }


}
