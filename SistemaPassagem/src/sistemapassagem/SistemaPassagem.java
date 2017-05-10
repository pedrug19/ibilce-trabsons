package sistemapassagem;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Luis Marcello Moraes Silva 
 * Gustavo Molina de Souza
 * Pedrenrique Guimarães
 */
public class SistemaPassagem {
	
    public static void main(String[] args) {
        int dia, mes, ano, hora, minutos, origem, destino, kilometragem, i, vagas, opcao=0,
        		 diaAdm, mesAdm, anoAdm, horaIda, minIda, horaChegada, minChegada;
        String cidadeOrigem, cidadeDestino, cidadeParada1, cidadeParada2, cidadeParada3;
        double preco;
        String nome, rg, profissao, cnh, modelo, marca, endereco;
		Scanner input = new Scanner(System.in);
        List<CadastraOnibus> listaOnibus = new ArrayList<CadastraOnibus>();
        CadastraPassageiro passageiro;
        List<CadastraPassageiro> listaPassageiro = new ArrayList<CadastraPassageiro>();
        List<Rota> listaRota = new ArrayList<Rota>();
        List<CadastraMotorista> listaMotorista = new ArrayList<CadastraMotorista>();
        
        /*TODO: FAZER SISTEMA INTEIRO PARA CADASTRAR CADA UM DOS DADOS
         * 	CONSERTAR O ERRO DO SCANNER PULAR UM DADO - FEITO
         * Teste Passageiro*/
        
        while(opcao!=-1){
        	//Menu principal organizado
        	System.out.println("Digite o que deseja fazer:");
        	System.out.println("1 - Cadastrar passageiro");
        	System.out.println("2 - Excluir último passageiro");
        	System.out.println("3 - Alterar dados de passageiro");
        	System.out.println("4 - Mostrar dados de passageiro");
        	System.out.println("5 - Cadastrar motorista");
        	System.out.println("6 - Excluir último motorista");
        	System.out.println("7 - Alterar dados de motorista");
        	System.out.println("8 - Mostrar dados de motorista");
        	System.out.println("9 - Cadastrar Rota");
        	System.out.println("10 - Excluir Rota");
        	System.out.println("11 - Alterar dados de Rota");
        	System.out.println("12 - Mostrar dados de Rota");
        	System.out.println("13 - Cadastrar Ônibus");
        	System.out.println("14 - Excluir Ônibus");
        	System.out.println("15 - Alterar dados de Ônibus");
        	System.out.println("16 - Mostrar dados de Ônibus");
        	System.out.println("-1 - Sair do programa");
        	
        	opcao = Integer.parseInt(input.nextLine());
        	
        	/*
        	 * 
        	 * 						Cadastros
        	 * 
        	 * */
        	
        	//Cadastro de passageiros
        	if(opcao == 1){
        	System.out.println("--Cadastrar Passageiro--");
      		
        	System.out.println("Digite o nome do passageiro: ");
        	nome = input.nextLine();
        	System.out.println("Digite o rg: ");
            	rg = input.nextLine();
            	System.out.print("Digite o dia de nascimento: ");
            	dia = input.nextInt();
            	System.out.print("Digite o mês de nascimento: ");
            	mes = input.nextInt();
            	System.out.print("Digite o ano de nascimento: ");
            	ano = Integer.parseInt(input.nextLine()); //Evita um problema do Scanner pular o próximo input.nextLine()
            	System.out.println("Digite a profissão: ");
            	profissao = input.nextLine();
            	System.out.println("Digite o endereço: ");
            	endereco = input.nextLine();
            	System.out.println("Rotas disponíveis: ");
            	if(listaRota == null){
            		System.out.println("Não há rotas disponíveis! ");
            		System.out.println("Não cadastrado");
            		break;
            	}
            	else{
            		
            	}
            	//passageiro = new CadastraPassageiro(nome, rg, profissao, endereco, dia, mes, ano);
            	//listaPassageiro.add(passageiro);
        	}
        	
        	//Cadastro de Motorista
        	if(opcao == 5){
        	System.out.println("--Cadastrar Motorista--");    		
        	System.out.println("Digite o nome do motorista: ");
        	nome = input.nextLine();
        	System.out.println("Digite o numero da CNH: ");
            	cnh = input.nextLine();
            	System.out.print("Digite o dia de admissão: ");
            	dia = Integer.parseInt(input.nextLine());
            	System.out.print("Digite o mês de admissão: ");
            	mes = Integer.parseInt(input.nextLine());
            	System.out.print("Digite o ano de admissão: ");
            	ano = Integer.parseInt(input.nextLine());
            	Data admissao = new Data(dia, mes, ano);
            	
            	CadastraMotorista motorista = new CadastraMotorista(cnh, nome, dia, mes, ano, admissao);
            	listaMotorista.add(motorista);
        	}
                //Exclui o último motorista da lista
                if(opcao == 6){ 
                        System.out.println("--Excluído da lista o último motorista--");
			listaMotorista.remove(listaMotorista.size()-1); //Usa o método "remove" para excluir da lista o elemento com último índice
                }
                //Altera os dados do motorista por meio do índice digitado pelo usuário
                if(opcao == 7){ 
		    System.out.println("--Editar dados Motorista--");	
                    System.out.println("Digite o índice do motorista a sofrer alteração: ");
                    i= Integer.parseInt(input.nextLine()); //Índice do elemento que será alterado
                    System.out.println("Digite o nome do motorista: ");
                    listaMotorista.get(i).setNome(input.nextLine()); //Usa o método set para alterar o atributo "nome" do motorista de índice i
                    System.out.println("Digite o numero da CNH: ");
                    listaMotorista.get(i).setCnh(input.nextLine()); //Usa o método set para alterar o atributo "cnh" do motorista de índice i
                    System.out.print("Digite o dia de admissão: ");
                    dia = Integer.parseInt(input.nextLine());
                    System.out.print("Digite o mês de admissão: ");
                    mes = Integer.parseInt(input.nextLine());
                    System.out.print("Digite o ano de admissão: ");
                    ano = Integer.parseInt(input.nextLine());
                    Data admissao = new Data(dia, mes, ano);
                    listaMotorista.get(i).setDatanasc(dia, mes, ano); //Usa o método set para alterar os atributos "dia", "mês" e "ano" de admissão do motorista de índice i                    
                }
                // Mostra na tela os dados do motorista pelo índice
                if(opcao == 8){ 
                    if(listaMotorista.isEmpty()==true){
                        System.out.println("Lista vazia!");
                    }
                    else{
                        System.out.println("Digite o índice do motorista: ");
                        i= Integer.parseInt(input.nextLine()); //Índice do motorista
                        if(listaMotorista.get(i)==null){
                            System.out.println("Índice inválido!");
                        }
                        else{
                            listaMotorista.get(i).getMotorista(); //Método que printa os dados do motorista                                                    
                        }
                    }
                }                
		//Cadastro de Rota
        	if(opcao == 9){
        		System.out.println("--Cadastrar Rota--");
    		
        		System.out.println("Digite o nome da Rota: ");
        		nome = input.nextLine();
        		System.out.println("Digite o numero da CNH: ");
        		cnh = input.nextLine();
        		System.out.print("Digite o dia de admissão: ");
        		dia = input.nextInt();
        		System.out.print("Digite o mês de admissão: ");
        		mes = input.nextInt();
        		System.out.print("Digite o ano de admissão: ");
        		ano = Integer.parseInt(input.nextLine());
        		
        		
        		//Data admissao = new Data(dia, mes, ano);
        		//Hora horarioIda = new Hora(horaIda, minIda);
        		//Hora horarioChegada = new Hora(horaChegada, minChegada);
        	
        		/*Rota rota = new Rota(cidadeOrigem, cidadeDestino, cidadeParada1,
        	    		cidadeParada2, cidadeParada3,
        	    		horarioIda, horarioChegada,
        	    		data, dataChegada, onibus, preco);*/
        		//listaRota.add(rota);
        	}
		// Cadastra um novo ônibus
        	if(opcao == 13){
        	System.out.println("--Cadastrar Ônibus--");       		           
        	System.out.println("Digite modelo do ônibus: ");
        	modelo = input.nextLine();
        	System.out.println("Digite a marca do ônibus: ");
            	marca = input.nextLine();
            	System.out.print("Digite a kilometragem do ônibus: ");
            	kilometragem = input.nextInt();
            	System.out.print("Digite o ano: ");
            	ano = input.nextInt();
            	System.out.print("Digite o número de vagas: ");
            	vagas = input.nextInt();
            	CadastraOnibus onibus = new CadastraOnibus(modelo, marca, kilometragem, ano);
            	listaOnibus.add(onibus); // Adiciona o novo ônibus ao final da lista
                listaOnibus.get(listaOnibus.size()).criarAssentos(vagas); // Chama o método criarAssentos do último elemento adicionado à lista
        	listaOnibus.get(listaOnibus.size()).reservarAssentos(); // Chama o método reservarAssentos do último elemento ônibus da lista
                } 		
		// Exclui o ônibus de índice i
                if(opcao == 14){
                    System.out.println("Digite o índice do ônibus a ser excluído: ");
                    i= input.nextInt();
                    listaOnibus.remove(i);
                }		
		// Altera dos dados do ônibus de índice i
                if(opcao == 15){
		    System.out.println("--Alterar dados Ônibus--");	
                    System.out.println("Digite o índice do onibus a sofrer alteração: ");
                    i= input.nextInt(); //Índice do elemento que será alterado
                    System.out.println("Digite o nome do motorista: ");
                    listaOnibus.get(i).setMarca(input.nextLine()); //Usa o método set para alterar o atributo "marca" do onibus de índice i
                    System.out.println("Digite o modelo da CNH: ");
                    listaOnibus.get(i).setModelo(input.nextLine()); //Usa o método set para alterar o atributo "modelo" do onibus de índice i
                    System.out.print("Digite o ano: ");
                    listaOnibus.get(i).setAno(input.nextInt()); //Usa o método set para alterar o atributo "ano" do onibus de índice i
                    System.out.print("Digite a kilometragem: ");
                    listaOnibus.get(i).setKilometragem(input.nextInt()); //Usa o método set para alterar o atributo "ano" do onibus de índice i                    
                }
		// Mostra os dados do ônibus de índice i
                if(opcao == 16){ 
                    System.out.println("Digite o índice do ônibus: ");
                    i= input.nextInt(); //Índice do ônibus
                    listaOnibus.get(i).getBus(); //Método que printa os dados do ônibus
                } 		
        	
        	//Cadastro de Ônibus
        	
        }
        
        input.close();
    }
    
}
