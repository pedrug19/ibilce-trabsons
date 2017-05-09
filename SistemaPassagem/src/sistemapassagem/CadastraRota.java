package sistemapassagem;
/**
 *
 * @author Luis Marcello Moraes Silva 
 * Gustavo Molina de Souza
 * Pedrenrique Guimarães
 */
public class CadastraRota {
    
    private int origem, destino, horaIda, minutosIda, horaChegada, minutosChegada, diaIda, mesIda, anoIda, diaChegada, mesChegada, anoChegada;
    private String cidadeOrigem, cidadeDestino;
    private double preco;
    private CadastraOnibus onibus;
    private Hora horarioIda;
    private Hora horarioChegada;
    private Data data;
    private Data dataChegada;
    
    public CadastraRota(int origem, int destino, int horaIda, int minutosIda, int diaIda, int mesIda, int anoIda, Hora horario, double preco){
    	this.origem = origem;
    	this.destino = destino;
    	this.preco = preco;
    	this.horaIda = horaIda;
    	this.minutosIda = minutosIda;
    	this.horarioIda = new Hora(horaIda, minutosIda);
    	this.diaIda = diaIda;
    	this.mesIda = mesIda;
    	this.anoIda = anoIda;
    	this.data = new Data(diaIda, mesIda, anoIda);
    	if(origem == 1){
     	   cidadeOrigem = "São José do Rio Preto";
        }
        if(origem==2){
     	   cidadeOrigem  = "Severínia";
        }
        if(origem==3){
     	   cidadeOrigem  = "Olímpia";
        }
        if(origem==4){
     	   cidadeOrigem  = "Bebedouro";
        }
        if(origem==5){
     	   cidadeOrigem  = "Ribeirão Preto";
        }
        
        if(destino==1){
 		   cidadeDestino = "São José do Rio Preto";
        }
 	   	if(destino==2){
 		   cidadeDestino  = "Severínia";
 	   	}
 	   	if(destino==3){
 		   cidadeDestino  = "Olímpia";
 	   	}
 	   	if(destino==4){
 		   cidadeDestino  = "Bebedouro";
 	   	}
 	   	if(destino==5){
 		   cidadeDestino  = "Ribeirão Preto";
 	   	}	
    }
    
    public void setOnibus(CadastraOnibus onibus){
    	this.onibus = onibus;
    }
    
    public void getRota(){
    	/*TODO: ARRUMAR DATA E HORA (PARCIALMENTE FEITO)
    	 * ARRUMAR PARA CASOS ESPECIAIS: VIRADA DE ANO, VIRADA DE MES
    	 * ARRUMAR TODAS AS ROTAS E TEMPOS NECESSÁRIOS
    	 * EXISTE ALGUMA FORMA MAIS FÁCIL DE FAZER ISSO DO QUE USAR FORÇA BRUTA?
    	*/
    	
    	//Rota indisponível
    	System.out.println("A(s) rota(s) disponível(is) é(são):");
 	   	if(origem==destino){
 	   		System.out.println("INVALIDO! destino e origem iguais.");  
 	   	}
 	   	
 	   	/*
 	   	 * 
 	   	 * ROTA TODA: SÃO JOSÉ DO RIO PRETO - RIBEIRÃO PRETO
 	   	 * 
 	   	 * */
 	   	
 	   	//SJRP a Severínia
 	   	if(origem==1 && destino==2){
 	   		horaChegada = horaIda;
 	   		minutosChegada = minutosIda + 30;
 	   		horarioChegada = new Hora(horaChegada, minutosChegada);
 	   		System.out.print("Rota entre " + cidadeOrigem + " e " + cidadeDestino + " diretamente às ");
 	   		horarioIda.getHora();
 	   		System.out.print(" no dia ");
 	   		data.getData();
 	   		System.out.println("Previsão de chegada: ");
 	   		horarioChegada.getHora();
 	   		System.out.println(" do dia ");
 	   		diaChegada = diaIda + horarioChegada.getRestoDia();
 	   		mesChegada = mesIda;
 	   		anoChegada = anoIda;
 	   		dataChegada = new Data(diaChegada, mesChegada, anoChegada);
 	   		dataChegada.getData();
 	   	}
 	   	
 	   	//SJRP a Olímpia
 	   	if(origem==1 && destino==3){
 	   		horaChegada = horaIda + 1;
	   		minutosChegada = minutosIda + 15;
	   		horarioChegada = new Hora(horaChegada, minutosChegada);
	   		System.out.print("Rota entre " + cidadeOrigem + " e " + cidadeDestino + " às ");
	   		horarioIda.getHora();
	   		System.out.print(" no dia ");
	   		data.getData();
	   		System.out.println("Passando por Severínia.");
	   		System.out.println("Previsão de chegada: ");
	   		horarioChegada.getHora();
	   		System.out.print(" do dia ");
	   		diaChegada = diaIda + horarioChegada.getRestoDia();
	   		mesChegada = mesIda;
	   		anoChegada = anoIda;
	   		dataChegada = new Data(diaChegada, mesChegada, anoChegada);
	   		dataChegada.getData();
 	   	}
 	   
 	   	//SJRP a Bebedouro
 	   	if(origem==1 && destino==4){
 	   		horaChegada = horaIda + 2;
	   		minutosChegada = minutosIda + 20;
	   		horarioChegada = new Hora(horaChegada, minutosChegada);
	   		System.out.print("Rota entre " + cidadeOrigem + " e " + cidadeDestino + " às ");
	   		horarioIda.getHora();
	   		System.out.print(" no dia ");
	   		data.getData();
	   		System.out.println("Passando por Severínia e Olímpia.");
	   		System.out.println("Previsão de chegada: ");
	   		horarioChegada.getHora();
	   		System.out.println(" do dia ");
	   		diaChegada = diaIda + horarioChegada.getRestoDia();
	   		mesChegada = mesIda;
	   		anoChegada = anoIda;
	   		dataChegada = new Data(diaChegada, mesChegada, anoChegada);
	   		dataChegada.getData();
 	   	}
 	   	
 	   	//SJRP a Ribeirão Preto
 	   	if(origem==1 && destino==5){
 	   		horaChegada = horaIda + 3;
	   		minutosChegada = minutosIda + 40;
	   		horarioChegada = new Hora(horaChegada, minutosChegada);
	   		System.out.print("Rota entre " + cidadeOrigem + " e " + cidadeDestino + " às ");
	   		horarioIda.getHora();
	   		System.out.print(" no dia ");
	   		data.getData();
	   		System.out.println("Passando por Severínia, Olímpia e Bebedouro.");
	   		System.out.println("Previsão de chegada: ");
	   		horarioChegada.getHora();
	   		System.out.println(" do dia ");
	   		diaChegada = diaIda + horarioChegada.getRestoDia();
	   		mesChegada = mesIda;
	   		anoChegada = anoIda;
	   		dataChegada = new Data(diaChegada, mesChegada, anoChegada);
	   		dataChegada.getData();
 	   	}
 	   	
 	   	//Severínia a Olímpia
 	   	if(origem==2 && destino==3){
 	   		horaChegada = horaIda;
	   		minutosChegada = minutosIda + 45;
	   		horarioChegada = new Hora(horaChegada, minutosChegada);
	   		System.out.print("Rota entre " + cidadeOrigem + " e " + cidadeDestino + " às ");
	   		horarioIda.getHora();
	   		System.out.print(" no dia ");
	   		data.getData();
	   		System.out.println("Previsão de chegada: ");
	   		horarioChegada.getHora();
	   		System.out.println(" do dia ");
	   		diaChegada = diaIda + horarioChegada.getRestoDia();
	   		mesChegada = mesIda;
	   		anoChegada = anoIda;
	   		dataChegada = new Data(diaChegada, mesChegada, anoChegada);
	   		dataChegada.getData();
 	   	}
 	   	
 	   	//Severínia a Bebedouro
 	   	if(origem==2 && destino==4){
 	   		horaChegada = horaIda + 1;
	   		minutosChegada = minutosIda + 40;
	   		horarioChegada = new Hora(horaChegada, minutosChegada);
	   		System.out.print("Rota entre " + cidadeOrigem + " e " + cidadeDestino + " às ");
	   		horarioIda.getHora();
	   		System.out.print(" no dia ");
	   		data.getData();
	   		System.out.println("Passando por Olímpia.");
	   		System.out.println("Previsão de chegada: ");
	   		horarioChegada.getHora();
	   		System.out.println(" do dia ");
	   		diaChegada = diaIda + horarioChegada.getRestoDia();
	   		mesChegada = mesIda;
	   		anoChegada = anoIda;
	   		dataChegada = new Data(diaChegada, mesChegada, anoChegada);
	   		dataChegada.getData();
 	   	}
 	   	
 	   	//Severínia a Ribeirão Preto
 	   	if(origem==2 && destino==5){
 	   		horaChegada = horaIda + 3;
	   		minutosChegada = minutosIda + 10;
	   		horarioChegada = new Hora(horaChegada, minutosChegada);
	   		System.out.print("Rota entre " + cidadeOrigem + " e " + cidadeDestino + " às ");
	   		horarioIda.getHora();
	   		System.out.print(" no dia ");
	   		data.getData();
	   		System.out.println("Passando por Olímpia e Bebedouro.");
	   		System.out.println("Previsão de chegada: ");
	   		horarioChegada.getHora();
	   		System.out.println(" do dia ");
	   		diaChegada = diaIda + horarioChegada.getRestoDia();
	   		mesChegada = mesIda;
	   		anoChegada = anoIda;
	   		dataChegada = new Data(diaChegada, mesChegada, anoChegada);
	   		dataChegada.getData();
 	   	}
 	   	
 	   	//Olímpia a Bebedouro
 	   	if(origem==3 && destino==4){
 	   		horaChegada = horaIda;
	   		minutosChegada = minutosIda + 50;
	   		horarioChegada = new Hora(horaChegada, minutosChegada);
	   		System.out.print("Rota entre " + cidadeOrigem + " e " + cidadeDestino + " às ");
	   		horarioIda.getHora();
	   		System.out.print(" no dia ");
	   		data.getData();
	   		System.out.println("Previsão de chegada: ");
	   		horarioChegada.getHora();
	   		System.out.println(" do dia ");
	   		diaChegada = diaIda + horarioChegada.getRestoDia();
	   		mesChegada = mesIda;
	   		anoChegada = anoIda;
	   		dataChegada = new Data(diaChegada, mesChegada, anoChegada);
	   		dataChegada.getData();
 	   	}
 	   	
 	   	//Olímpia a Ribeirão Preto
 	   	if(origem==3 && destino==5){
 	   		horaChegada = horaIda + 2;
	   		minutosChegada = minutosIda + 25;
	   		horarioChegada = new Hora(horaChegada, minutosChegada);
	   		System.out.print("Rota entre " + cidadeOrigem + " e " + cidadeDestino + " às ");
	   		horarioIda.getHora();
	   		System.out.print(" no dia ");
	   		data.getData();
	   		System.out.println("Passando por Bebedouro.");
	   		System.out.println("Previsão de chegada: ");
	   		horarioChegada.getHora();
	   		System.out.println(" do dia ");
	   		diaChegada = diaIda + horarioChegada.getRestoDia();
	   		mesChegada = mesIda;
	   		anoChegada = anoIda;
	   		dataChegada = new Data(diaChegada, mesChegada, anoChegada);
	   		dataChegada.getData();
 	   	}
 	   	
 	   	//Bebedouro a Ribeirão Preto
 	   	if(origem==4 && destino==5){
 	   		horaChegada = horaIda + 1;
	   		minutosChegada = minutosIda + 20;
	   		horarioChegada = new Hora(horaChegada, minutosChegada);
	   		System.out.print("Rota entre " + cidadeOrigem + " e " + cidadeDestino + " às ");
	   		horarioIda.getHora();
	   		System.out.print(" no dia ");
	   		data.getData();
	   		System.out.println("Passando por Olímpia e Bebedouro.");
	   		System.out.println("Previsão de chegada: ");
	   		horarioChegada.getHora();
	   		System.out.println(" do dia ");
	   		diaChegada = diaIda + horarioChegada.getRestoDia();
	   		mesChegada = mesIda;
	   		anoChegada = anoIda;
	   		dataChegada = new Data(diaChegada, mesChegada, anoChegada);
	   		dataChegada.getData();
 	   	}
 	   	
 	   	/*
 	   	 * 
 	   	 * ROTA INVERSA: RIBEIRÃO PRETO A SJRP 
 	   	 * 
 	   	 * 
 	   	 * */
 	   	
 	   	//Ribeirão a SJRP
 	   	if(origem == 5 && destino == 1){
 	   		
 	   	}
 	   	
 	   	//
 	   	if(origem == 5 && destino == 2){
 	   		
 	   	}
 	   	
 	   	if(origem == 5 && destino == 3){
 	   		
 	   	}
 	   	
 	   	if(origem == 5 && destino == 4){
 	   		
 	   	}
 	   	
 	   	if(origem == 4 && destino == 1){
 	   		
 	   	}
 	   	
 	   	if(origem == 4 && destino == 2){
 	   		
 	   	}
 	   	
 	   	if(origem == 4 && destino == 3){
	   		
	   	}
 	   	
 	   	if(origem == 3 && destino == 1){
	   		
	   	}

 	   	if(origem == 3 && destino == 2){
	   		
	   	}

 	   	if(origem == 2 && destino == 1){
	   		
	   	}
 	   	
 	   	else{
 	   		System.out.println("Não há rotas entre " + cidadeOrigem + " e " + cidadeDestino + ".");
 	   	}
 	   //System.out.println("Rota: " + cidadeOrigem + "-" + cidadeDestino);
    }
    
    public void getOnibus(){
    	System.out.println("O ônibus que fará a rota é: ");
    	onibus.getBus();
    }
}
