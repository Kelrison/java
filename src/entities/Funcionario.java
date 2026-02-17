package kelrison_java.src.entities;

public class Funcionario {
private String name;
private int matricula;
private double salario;

public Funcionario(String name, int matricula, double salario){
    this.name = name;
    this.matricula = matricula;
    this.salario = salario;
}

public String getName(){
    return name;
}

public int getMatricula(){
    return matricula;
}

public double getSalario(){
    return salario;
}

public void setSalario(double salario){
    this.salario = salario;
}
}
