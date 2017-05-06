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
    private CadastraOnibus onibus;
    private Hora horarioIda;
    private Hora horarioChegada;
    private Data data;
    private Data dataChegada;
    
    public CadastraRota(int origem, int destino, int horaIda, int minutosIda, int diaIda, int mesIda, int anoIda, Hora horario){
    	this.origem = origem;
    	this.destino = destino;
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
    	*/
    	
    	//Rota indisponível
    	System.out.println("A(s) rota(s) disponível(is) é(são):");
 	   	if(origem==destino){
 	   		System.out.println("INVALIDO! destino e origem iguais.");  
 	   	}
 	   	
 	   	//SJRP a Severínia
 	   	if(origem==1 && destino==2){
 	   		horaChegada = horaIda;
 	   		minutosChegada = minutosIda + 30;
 	   		horarioChegada = new Hora(horaChegada, minutosChegada);
 	   		System.out.print("Rotas entre " + cidadeOrigem + " e " + cidadeDestino + " diretamente às ");
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
	   		System.out.print("Rotas entre " + cidadeOrigem + " e " + cidadeDestino + " às ");
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
	   		System.out.print("Rotas entre " + cidadeOrigem + " e " + cidadeDestino + " às ");
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
	   		System.out.print("Rotas entre " + cidadeOrigem + " e " + cidadeDestino + " às ");
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
 	   	//Severínia a Bebedouro
 	   	if(origem==2 && destino==4){
 	   		horaChegada = horaIda + 1;
	   		minutosChegada = minutosIda + 40;
	   		horarioChegada = new Hora(horaChegada, minutosChegada);
	   		System.out.print("Rotas entre " + cidadeOrigem + " e " + cidadeDestino + " às ");
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
 	   	if(origem==3 && destino==2){
 	   		System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" diretamente as 00:00 no dia dd/mm/aaaa.");
 	   	}
 	   	if(origem==3 && destino==4){
 	   		System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" diretamente as 00:00 no dia dd/mm/aaaa.");
 	   	}
 	   	if(origem==3 && destino==5){
 	   		System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" passando por Marilia e Ilha Solteira as 00:00 no dia dd/mm/aaaa.");
 	   	}
 	   	if(origem==4 && destino==5){
 	   		System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" passando por Marilia e Ilha Solteira as 00:00 no dia dd/mm/aaaa.");
 	   		System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" passando por Marilia e Ilha Solteira as 00:00 no dia dd/mm/aaaa.");
 	   	}
 	   	if(origem==2 && destino==5){
 	   		System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" diretamente as 00:00 no dia dd/mm/aaaa.");
 	   	}
 	   	else{
 	   		System.out.println("Não há rotas entre " + cidadeOrigem + " e " + cidadeDestino + ".");
 	   	}
 	   //System.out.println("Rota: " + cidadeOrigem + "-" + cidadeDestino);
    }
    /*
    public 
    
    /*
    
    //private String cidade[]= new String[]{"São José do Rio Preto","São Paulo","Marilia","Ilha Solteira","Bauru"};
    //suponha que esta empresa trabalhe apenas com 5 cidades.
   public void DefineOrigem(int opcaoorigem){
       
       this.origem = opcaoorigem;
       
       if(origem == 1){
    	   cidadeOrigem = "São José do Rio Preto";
       }
       if(origem==2){
    	   cidadeOrigem  = "São Paulo";
       }
       if(origem==3){
    	   cidadeOrigem  = "Marilia";
       }
       if(origem==4){
    	   cidadeOrigem  ="Ilha Solteira";
       }
       if(origem==5){
    	   cidadeOrigem  = "Bauru";
       }
   }
   
   public void defineDestino (int opcaodestino){
	   if(destino==1){
		   cidadeDestino = "São José do Rio Preto";
	   }
	   if(destino==2){
		   cidadeDestino  = "São Paulo";
	   }
	   if(destino==3){
		   cidadeDestino  = "Marilia";
	   }
	   if(destino==4){
		   cidadeDestino  ="Ilha Solteira";
	   }
	   if(destino==5){
		   cidadeDestino  = "Bauru";
	   }
   }
   
   public void MostraRota(){
	   System.out.println("A(s) rota(s) disponível(is) é(são):");
	   if(origem==destino){
		   System.out.println("INVALIDO! destino e origem iguais.");  
	   }
	   if(origem==1 && destino==2){
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" diretamente as 00:00 no dia dd/mm/aaaa.");
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" passando por Marilia as 00:00 no dia dd/mm/aaaa.");
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" passando por Marilia e Ilha Solteira as 00:00 no dia dd/mm/aaaa.");
	   }
	   if(origem==1 && destino==3){
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" diretamente as 00:00 no dia dd/mm/aaaa.");
		   System.out.println("Não há rotas entre"+cidadeOrigem+"e"+cidadeDestino+".");
	   }
	   if(origem==1 && destino==4){
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" diretamente as 00:00 no dia dd/mm/aaaa.");
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" diretamente as 00:00 no dia dd/mm/aaaa.");
	   }
	   if(origem==1 && destino==5){
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" diretamente as 00:00 no dia dd/mm/aaaa.");
	   }
	   if(origem==2 && destino==4){
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" diretamente as 00:00 no dia dd/mm/aaaa.");
	   }
	   if(origem==3 && destino==2){
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" diretamente as 00:00 no dia dd/mm/aaaa.");
	   }
	   if(origem==3 && destino==4){
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" diretamente as 00:00 no dia dd/mm/aaaa.");
	   }
	   if(origem==3 && destino==5){
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" passando por Marilia e Ilha Solteira as 00:00 no dia dd/mm/aaaa.");
	   }
	   if(origem==4 && destino==5){
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" passando por Marilia e Ilha Solteira as 00:00 no dia dd/mm/aaaa.");
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" passando por Marilia e Ilha Solteira as 00:00 no dia dd/mm/aaaa.");
	   }
	   if(origem==2 && destino==5){
		   System.out.println("Rotas entre"+cidadeOrigem+"e"+cidadeDestino+" diretamente as 00:00 no dia dd/mm/aaaa.");
	   }else{
		   System.out.println("Não há rotas entre"+cidadeOrigem+"e"+cidadeDestino+".");
	   }
   }   
 */
}
