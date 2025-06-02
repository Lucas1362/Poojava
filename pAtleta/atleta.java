package pAtleta;


public class atleta{
    String nome; 
    int idade;
    String sexo; 
    String modalidade;
    String hobbyOuProfissao;


    
    public void correr(){
        System.out.println("Eu" + nome +  "Estou correndo");
    }

    public void idade (){
        System.out.println("Eu" + nome +  "Tenho" + idade + "anos");
    }

    public void modalidade (){
        System.out.println("Eu" + nome +  "Pratico" + modalidade);
    }

    public void hobbyOuProfissao(){
        System.out.println("Eu" + nome + "pratico " + modalidade + "por " + hobbyOuProfissao );
        
    }

}
