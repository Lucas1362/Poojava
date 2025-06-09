package FundamentosDaProgJava.basico;

public class testePessoa {
    public static void main(String[] args) {
        pessoa pessoa1 = new pessoa();

        pessoa1.nome = "Jamerson Lucas";
        pessoa1.sobrenome = "Tenorio Valentim";
        pessoa1.idade = 20;
        pessoa1.cidade = "São Paulo";
        pessoa1.estado = "São Paulo";
        pessoa1.pais = "Brasil";
        
        pessoa1.dados();


        pessoa pessoa2 = new pessoa();
        pessoa2.nome = "João";
        pessoa2.sobrenome = "Silva";
        pessoa2.idade = 30;
        pessoa2.cidade = "Rio de Janeiro";
        pessoa2.estado = "Rio de Janeiro";
        pessoa2.pais = "Brasil";

        pessoa2.dados();
        
    }

    
}
