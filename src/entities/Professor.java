package kelrison_java.src.entities;

public class Professor {
    String nome;
    int idade;
    String area;

    public Professor ( String nome, int idade, String area){
        this.nome = nome;
        this.idade = idade;
        this.area = area;
    }

    public void exibirDados(){
        System.out.println("Nome do professor: " + nome );
        System.out.println("Idade do professor: " + idade );
        System.out.println("Área do professor: " + area );
    }

}
