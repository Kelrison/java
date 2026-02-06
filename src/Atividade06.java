package kelrison_java.src;
import java.util.Scanner;

public class Atividade06{
    public static void main (String[]args){
        int senha = 0;
        int acumulador = 0;
        Scanner leitor = new Scanner(System.in);

    while (senha != 2002){
        System.out.println("Informe a senha:");
        senha = leitor.nextInt();
        if (senha != 2002){
            System.out.println("Senha incorreta!");
            acumulador++;
        }else { 
            System.out.println("Acesso liberado!");
            }
        if (acumulador > 3){
            System.out.println("Tentativas esgotadas. Tente novamente mais tarde.");
            break;
        }
        }


    leitor.close();

    }
   
    
        }