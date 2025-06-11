package pContador;

public class TesteContador {
    public static void main(String[] args) {
        Contador c = new Contador();
        c.acrescentar();
        c.acrescentar();

        c.consultar();

        c.zerar();
        c.consultar();
    }    
}
