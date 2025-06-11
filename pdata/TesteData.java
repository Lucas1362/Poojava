package pdata;

public class TesteData {
    public static void main(String[] args) {
        Data data1 = new Data(15, 8, 2023);
        Data data2 = new Data(1, 1, 2022);
        Data data3 = new Data(29, 2, 2024);
        Data dataInvalida = new Data(31, 4, 2023); // Data inválida

        System.out.print("Data 1: ");
        data1.imprimirData(); // 15/08/2023
        System.out.print("Data 2: ");
        data2.imprimirData(); 
        System.out.print("Data 3: ");
        data3.imprimirData(); 
        System.out.print("Data Inválida: ");
        dataInvalida.imprimirData(); // 01/01/2000 (data padrão)

        int resultado = data1.comparar(data2);
        if (resultado < 0) {
            System.out.println("Data 1 é anterior a Data 2");
        } else if (resultado > 0) {
            System.out.println("Data 1 é posterior a Data 2");
        } else {
            System.out.println("Data 1 é igual a Data 2");
        }

        resultado = data1.comparar(data3);
        if (resultado < 0) {
            System.out.println("Data 1 é anterior a Data 3");
        } else if (resultado > 0) {
            System.out.println("Data 1 é posterior a Data 3");
        } else {
            System.out.println("Data 1 é igual a Data 3");
        }
    }
}
