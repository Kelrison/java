package kelrison_java.src.entities;

public class ConversaoMonetaria {

    public static double converter (double valor, double taxa, double iof){
        double valorConvertido = valor * taxa;
        double valorIOF = (valorConvertido * iof)/100;
        return valorConvertido + valorIOF;
    }

}
