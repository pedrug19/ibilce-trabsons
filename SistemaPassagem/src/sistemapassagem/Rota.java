package sistemapassagem;

public class Rota {
	private int origem, destino, horaIda, minutosIda, horaChegada, minutosChegada, diaIda, mes, ano;
    private String cidadeOrigem, cidadeDestino, cidadeParada1, cidadeParada2, cidadeParada3;
    private CadastraOnibus onibus;
    private double preco;
    private Hora horarioIda;
    private Hora horarioChegada;
    private Data data;
    private Data dataChegada;
    
    public Rota(String cidadeOrigem, String cidadeDestino, String cidadeParada1,
    		String cidadeParada2, String cidadeParada3,
    		Hora horarioIda, Hora horarioChegada,
    		Data data, Data dataChegada, CadastraOnibus onibus, double preco)
    {
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
    }
    
    public void setCidadeOrigem(String cidadeOrigem){
    	
    }
    
    public void setCidadeDestino(String cidadeDestino){
    	
    }
}
