package kelrison_java.src;

class Atividade09{

    public static void main(String[]args){

        String palavra = "Kelrison LEITE COEelHO";
        String[] nomes;
        System.out.println(palavra.toLowerCase());

        nomes = palavra.split(" ");
        //Laço para imprimir as posições do vetor conforme tamanho total
        for (int i = 0;i<nomes.length;i++){
            System.out.println("Nome "+ i + ":" +nomes[i]);
        }


            }

}
