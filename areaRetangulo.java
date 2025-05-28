import java.util.Scanner;


public class areaRetangulo {
    public static void main(String[] args) {
        double base, altura, area; 
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual a base do retangulo: ");
        base = leitor.nextDouble();

        System.out.print("Qual a altura do retangulo: ");
        altura = leitor.nextDouble();

        area = base * altura;
        System.out.print("A area do retangulo forncedio foi: " + area);

        leitor.close();


    }
    
}
