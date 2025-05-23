import java.util.Scanner;


public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Opa, " + nome + ". Voce tem " + idade + " anos");
        sc.close();
        


    }
}
