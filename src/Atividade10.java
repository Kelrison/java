package kelrison_java.src;
import java.time.LocalDate;
import java.util.Scanner;
public class Atividade10{

    // Função para imprimir nome informado
    public static void imprimirNome(String valor){
            System.out.println("O nome informado foi:"+ valor);

        }

    // função para calcular e imprimir idade
    public static void calcular_imprimirIdade(int dtnascimento){
        int idade = LocalDate.now().getYear() - dtnascimento;
        System.out.println("A idade atual é:"+ idade);
    }  

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome;
        int dataNascimento;   

        System.out.println("Informe um nome:");
        nome = leitor.nextLine();
        System.out.println("Informe o ano de nascimento");
        dataNascimento = leitor.nextInt();
        calcular_imprimirIdade(dataNascimento);
        imprimirNome(nome);

        

        leitor.close();




    }
    
    }
