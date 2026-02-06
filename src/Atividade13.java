package kelrison_java.src;
import java.util.Scanner;
import kelrison_java.src.entities.Aluno;

public class Atividade13 {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        Aluno joao = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        joao.nome = leitor.nextLine();
        System.out.print("Digite a primeira nota: ");
        joao.nota1 = leitor.nextDouble();
        System.out.print("Digite a segunda nota: ");
        joao.nota2 = leitor.nextDouble();
        System.out.print("Digite a terceira nota: ");
        joao.nota3 = leitor.nextDouble(); 
        
        double media = joao.calcularMedia();

        if (media >= 6){
            System.out.println("A média do aluno " + joao.nome + " é: " + media);
            System.out.println("Aluno aprovado!Parabéns!!");
        } else{
            System.out.println("A média do aluno " + joao.nome + " é: " + media);
            System.out.println("Aluno reprovado! Barro!!");
            System.out.println("Faltam " + (6 - media) +" pontos para a aprovação!");
        }
        
    }}


