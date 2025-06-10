package FundamentosDaProgJava.CalculadoraJv;

public class Calculadora {
    int a;
    int b;
    int resultado;
    void soma() {
        resultado = a + b;

    }

    void subtracao(){
        resultado = a - b;
        System.out.println("o valor obtido foi: " + resultado);
    }

    void divisao(){
        if (b != 0) {
            resultado = a / b;
        }
        else{
            System.out.println("não é possivel dividir por zero");
        }

    }

    void multiplicacao(){
        resultado = a * b;

    }

    
}
