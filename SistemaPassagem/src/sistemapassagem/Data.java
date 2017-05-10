package sistemapassagem;

/**
 *
 * @author Luis Marcello Moraes Silva Gustavo Molina de Souza Pedrenrique
 * Guimarães
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void getData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

}
