package pContador;
public class Contador {
    private int contador; 

    public Contador() {
        this.contador = 0;
    }
    
    public Contador(int valorInicial) {
        this.contador = valorInicial;
    }
    
    public void acrescentar() {
        contador += 1;
    }
    
    public void retirar() {
        contador -= 1;
    }
    
    public void consultar() {
        System.out.println("Atualmente o contador está no número: " + contador);
    }
    
    public void zerar() {
        contador = 0;
    }
}