package kelrison_java.src;
import java.util.Scanner;

import entities.Automovel;

public class Atividade12 {
    public static void main(String[]args){
        Scanner leitor = new Scanner(System.in);
        int opcao = 1;

        Automovel carro = new Automovel();
        
        while(opcao != 0) {
        System.out.println(":::: Menu de opções::::");
        System.out.println("1 - Cadastrar automóvel");
        System.out.println("2 - Exibir dados do automóvel");
        System.out.println("3 - Adicionar ao estoque");
        System.out.println("4 - Remover do estoque");
        System.out.println("0 - Sair");
        System.out.println("Digite a opção desejada:");
        opcao = leitor.nextInt();
        leitor.nextLine(); // Consumir a quebra de linha pendente

        switch (opcao) {
            case 1:
                System.out.print("Digite a marca do automóvel: ");
                carro.marca = leitor.nextLine();
                System.out.print("Digite o modelo do carro:");
                carro.modelo = leitor.nextLine();
                System.out.print("Digite o ano do carro:");
                carro.ano = leitor.nextInt();
                System.out.print("Digite o preço do carro:");
                carro.preco = leitor.nextDouble();
                System.out.print("Digite a quantidade em estoque:");
                carro.qtdEstoque = leitor.nextInt();
                break;
            case 2:
                System.out.println("Marca: " + carro.marca);
                System.out.println("Modelo: " + carro.modelo);
                System.out.println("Ano: " + carro.ano);
                System.out.println("Preço: " + carro.preco);
                System.out.println("Quantidade em estoque: " + carro.qtdEstoque);
                break;
            case 3:
                System.out.println("Digite a quantidade a ser adicionada ao estoque:");
                int quantidadeAdicionar = leitor.nextInt();
                carro.addEstoque(quantidadeAdicionar);
                System.out.println("Estoque atualizado!");
                break;
            case 4:
                System.out.println("Digite a quantidade a ser removida do estoque:");
                int quantidadeRemover = leitor.nextInt();
                carro.delEstoque(quantidadeRemover);
                System.out.println("Estoque atualizado!");
                break;
            case 0:
                System.out.println("Logout realizado!");
                break;
            default:
                System.out.println("Opção inválida!");
                break;

        }

    }



        leitor.close();
    }
    
}
