package pdata;


public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (isDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private boolean isDataValida(int dia, int mes, int ano) {
        if (ano < 0 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }
        int[] diasPorMes = { 31, 28 + (isAnoBissexto(ano) ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return dia <= diasPorMes[mes - 1];
    }

    private boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public void imprimirData() {
        System.out.printf("%02d/%02d/%04d%n", dia, mes, ano);
    }

    public int comparar(Data outra) {
        if (this.ano < outra.ano) return -1;
        if (this.ano > outra.ano) return 1;
        if (this.mes < outra.mes) return -1;
        if (this.mes > outra.mes) return 1;
        if (this.dia < outra.dia) return -1;
        if (this.dia > outra.dia) return 1;
        return 0;
    }
}
