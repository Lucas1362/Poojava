public class separarTresDigitos {
    public static void main(String[] args) {
        int digitos = 987;
        int centena = digitos / 100;
        int dezena = ((digitos / 100) % 10);
        int unidade = digitos % 10;
        
        System.out.print(centena + " " + dezena + " " + unidade + " "); 
    }
}
