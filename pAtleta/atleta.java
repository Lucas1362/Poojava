package pAtleta;


public class Atleta {
    String nome; 
    int idade;
    String sexo; 
    String modalidade;
    String hobbyOuProfissao;


    public void nome(){
        System.out.println("Meu nome é " + nome);
    }
    public void correr(){
        System.out.println("Eu" + nome +  "Estou correndo");
    }

    public void sexo(){
        System.out.println(sexo);
    }

    public void idade (){
        System.out.println("Eu " + nome +  " Tenho " + idade + " anos");
    }

    public void modalidade (){
        System.out.println("Pratica: " + modalidade);
    }

    public void hobbyOuProfissao(){
        System.out.println("Eu" + nome + "pratico " + modalidade + "por " + hobbyOuProfissao );

    }


    public void apresentar(){
        System.out.println("olá, me chamo " + nome + ", eu possuo " + idade + " anos" +  ", pratico a modalidade " + modalidade);
        
    }

}
