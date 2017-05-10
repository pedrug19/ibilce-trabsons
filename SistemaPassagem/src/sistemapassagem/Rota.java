package sistemapassagem;

public class Rota {

    private int horaIda, minutosIda, horaChegada, minutosChegada, diaIda, mes, ano;
    private String cidadeOrigem, cidadeDestino, cidadeParada1, cidadeParada2, cidadeParada3;
    private CadastraOnibus onibus;
    private CadastraMotorista motorista;
    private double preco;
    private Hora horarioIda;
    private Hora horarioChegada;
    private Data data;
    private Data dataChegada;

    public Rota(String cidadeOrigem, String cidadeDestino, String cidadeParada1,
            String cidadeParada2, String cidadeParada3,
            Hora horarioIda, Hora horarioChegada,
            Data data, Data dataChegada, CadastraOnibus onibus, double preco, CadastraMotorista motorista) {
        this.cidadeOrigem = cidadeOrigem;
        this.cidadeDestino = cidadeDestino;
        this.cidadeParada1 = cidadeParada1;
        this.cidadeParada2 = cidadeParada2;
        this.cidadeParada3 = cidadeParada3;
        this.horarioIda = horarioIda;
        this.preco = preco;
        this.horarioChegada = horarioChegada;
        this.data = data;
        this.dataChegada = dataChegada;
        this.onibus = onibus;
        this.motorista = motorista;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public void setCidadeParada1(String cidadeParada1) {
        this.cidadeParada1 = cidadeParada1;
    }

    public void setCidadeParada2(String cidadeParada2) {
        this.cidadeParada2 = cidadeParada2;
    }

    public void setCidadeParada3(String cidadeParada3) {
        this.cidadeParada3 = cidadeParada3;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setData(int diaIda, int mes, int ano, int diaChegada) {
        this.diaIda = diaIda;
        this.mes = mes;
        this.ano = ano;
        data.setDia(diaIda);
        data.setMes(mes);
        data.setAno(ano);

        dataChegada.setDia(diaChegada);
    }

    public double getPreco() {
        return preco;
    }

    public void getRota() {
        System.out.println("Rota: " + cidadeOrigem + " - " + cidadeDestino);
        System.out.println("Passando por: " + cidadeParada1 + " " + cidadeParada2 + " " + cidadeParada3);
        System.out.println("Motorista: " + motorista.getNome());
        System.out.print("Preço da passagem: " + preco);
        System.out.println("");
        System.out.print("Hora de Saída: ");
        data.getData();
        System.out.print("Hora de Chegada prevista: ");
        dataChegada.getData();
        System.out.println("Ônibus: ");
        onibus.getBus();
    }
}
