package kelrison_java.src.entities;

public class Automovel {

    public String marca;
    public String modelo;
    public int ano;
    public double preco;
    public int qtdEstoque;

    public void addEstoque(int quantidade){
        this.qtdEstoque += quantidade;
    }

    public void delEstoque(int quantidade){
        this.qtdEstoque -= quantidade;
    }





}
