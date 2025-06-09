package pAtleta;

public class AtletaVerificar {
    public static void main(String[] args) {
        Atleta p1 = new Atleta();
        Atleta p2 = new Atleta();


        p1.idade = 20;
        p1.nome = "João";
        p1.modalidade = "Futebol";
        p1.sexo = "masculino";

        p2.idade = 19;
        p2.nome = "Maria";
        p2.modalidade = "Natação";
        p2.sexo = "feminino";


     

        p2.apresentar();
        

    }


    
}
