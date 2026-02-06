package kelrison_java.src;
// Declaração de função com atributos e método de soma
import java.util.Scanner;

public class Atividade11{

    public static class soma{
public int a;
public int b;

public int somar(){
    return a +b ;
}
}

public static void main(String[]args){

Scanner leitor = new Scanner(System.in);

soma calculadora = new soma();



System.out.println("Informe o primeiro número:");
calculadora.a = leitor.nextInt();

System.out.println("Informe o segundo número:");
calculadora.b = leitor.nextInt();

int somados = calculadora.somar();

System.out.println("o primeiro valor é:" + calculadora.a);
System.out.println("o segundo valor é:" + calculadora.b);
System.out.println("A soma dos dois valores é:" + somados);

leitor.close();
}

}