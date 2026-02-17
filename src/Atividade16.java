package kelrison_java.src;
import java.util.Scanner;
import kelrison_java.src.entities.Funcionario;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("informe o nome do funcionário:");
        String name = leitor.nextLine();

        System.out.println("Informe a matricula do funcionário:");
        int matricula = leitor.nextInt();

        System.out.println("Informe o salário do funcionário:");
        double salario = leitor.nextDouble();

        Funcionario gerente = new Funcionario(name, matricula, salario);

        System.out.println("Os dados informados são:");

        System.out.println("Nome do funcionário:" + gerente.getName());
        System.out.println("A matrícula é:" + gerente.getMatricula());
        System.out.println("O salário é:" + gerente.getSalario());

        System.out.println("Deseja atualizar o salário? 1 - SIM ou 2 - NÃO");
        int resposta = leitor.nextInt();
        if (resposta == 1 ){
            System.out.println("Informe novo salário:");
            gerente.setSalario(leitor.nextDouble());
            System.out.println("O salário atualizado é:" + gerente.getSalario());
        } else {
            System.out.println("Salário mantido:" + gerente.getSalario());
        }
    }
}


