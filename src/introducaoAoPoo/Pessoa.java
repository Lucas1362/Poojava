package src.introducaoAoPoo;

public class Pessoa {
    String nome; 
    int idade; 
    String emprego;

    public Pessoa( String nome, int idade, String emprego){

        this.nome = nome;
        this.idade = idade;
        this.emprego = emprego;
    }

    public void apresentar(){
        System.out.println("ola " + nome + " sua idade é " + idade + " e seu emprego é " + emprego);
    }
}
