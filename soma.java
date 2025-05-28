import java.util.Scanner;

public class soma {
    public static void main(String[] args) {

        String pergunta = "bem vindo ao codigo de soma!!";
        Scanner leitor = new Scanner(System.in);

        int a, b;

        System.out.println("Digite um numero: ");
        a = leitor.nextInt();

        System.out.println("Digite outro numero: ");
        b = leitor.nextInt();

        int soma = a + b; 
        System.out.println("A soma dos dois numeros e: " + soma);
        
        




    }
    
}
