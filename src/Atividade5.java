package kelrison_java.src;
import java.util.Scanner;

public class Atividade5{
    public static void main(String[]args){
        int numero;
        int controle = 1;
        Scanner leitor = new Scanner(System.in);

        while (controle != 0) {
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
        //Solicitar ao usuário se deseja continuar ou sair
        System.out.println("Deseja continuar? 1 CONTINUAR - 0 SAIR");
               controle = leitor.nextInt();

        }
        
        leitor.close();

    }


}
