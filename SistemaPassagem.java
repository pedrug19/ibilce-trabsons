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
        		 diaAdm, mesAdm, anoAdm;
        String nome, rg, profissao, cnh, modelo, marca, endereco;
        int op_passa,op_oni,op_moto;
        
        
        
	Scanner input = new Scanner(System.in);
        CadastraPassageiro passageiro;
        CadastraMotorista motorista;
        CadastraOnibus onibus;
        Rota rota;
        List<CadastraOnibus> listaOnibus = new ArrayList<CadastraOnibus>();
        List<CadastraPassageiro> listaPassageiro = new ArrayList<CadastraPassageiro>();
        //List<Rota> listaRota = new ArrayList<CadastraRota>();
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
                opcao=input.nextInt();
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
            	passageiro = new CadastraPassageiro(nome, rg, profissao, endereco, dia, mes, ano);
            	listaPassageiro.add(passageiro);
        	}
                //exclui passageiro
        	if(opcao==2){
                    System.out.println("Digite o passageiro que deseja excluir (número):");
                    op_passa=input.nextInt();
                    listaPassageiro.remove(passageiro[op_passa]);
                }
                //alterar dados
                if(opcao==3){
                System.out.println("Digite o passageiro que deseja alterar (número):");
                op_passa=input.nextInt();
                System.out.println("Digite o nome do passageiro: ");
                passageiro[op_passa].setNome(input.nextLine());
        	System.out.println("Digite o rg: ");
            	passageiro[op_passa].setRg(input.nextLine());
            	
            	System.out.println("Digite a profissão: ");
            	passageiro[op_passa].setProfissao(input.nextLine());
            	System.out.println("Digite o endereço: ");
            	passageiro[op_passa].setEndereco(input.nextLine());
                    
                System.out.print("Digite o dia de nascimento: ");
            	dia=input.nextInt();
            	System.out.print("Digite o mês de nascimento: ");
            	mes=input.nextInt();
            	System.out.print("Digite o ano de nascimento: ");
            	ano=input.nextInt();
                passageiro[op_passa].setDatanasc(dia, mes, ano);
                }
                //exibir
                if(opcao==4){
                    System.out.println("Digite o passageiro que deseja excluir (número):");
                    op_passa=input.nextInt();
                    passageiro[op_passa].getPassageiro();
                }
                
        	//Cadastro de Motorista
        	if(opcao == 5){
                System.out.println("--Cadastrar Motorista--");
        		
        	System.out.println("Digite o nome do motorista: ");
        	nome = input.nextLine();
        	System.out.println("Digite o numero da CNH: ");
            	cnh = input.nextLine();
            	System.out.print("Digite o dia de admissão: ");
            	dia = input.nextInt();
            	System.out.print("Digite o mês de admissão: ");
            	mes = input.nextInt();
            	System.out.print("Digite o ano de admissão: ");
            	ano = Integer.parseInt(input.nextLine());
            	Data admissao = new Data(dia, mes, ano);
            	
            	motorista = new CadastraMotorista(nome, cnh, dia, mes, ano, admissao);
            	listaMotorista.add(motorista);
        	}
                //Excluir último motorista
                if(opcao==6){
                    
                }
                if(opcao==7){
                    
                }
                if(opcao==8){
                    
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
        		Data admissao = new Data(dia, mes, ano);
        	
        		CadastraMotorista motorista = new CadastraMotorista(nome, cnh, dia, mes, ano, admissao);
        		listaMotorista.add(motorista);
        	}
                
                if(opcao==10){
                }
                if(opcao==11){
                }
                if(opcao==12){
                }
                
                //cadastrar onibus
                if(opcao==13){
                    System.out.println("\nDigite o modelo:\n");
                    modelo = input.nextLine();
                    System.out.println("\nDigite a marca:\n");
                    marca = input.nextLine();
                    System.out.println("\nDigite a kilometragem:\n");
                    kilometragem = input.nextInt();
                    System.out.println("\nDigite o ano:\n");
                    ano = input.nextInt();
                    System.out.println("\n\n");
                    onibus = new CadastraOnibus(modelo, marca, kilometragem, ano);
                    listaOnibus.add(onibus);
                }
                //excluir
                if(opcao==14){
                    System.out.println("Digite o onibus que deseja alterar (número):");
                    op_oni=input.nextInt();
                    listaOnibus.remove(onibus[op_oni]);
                }
                //alterar
                if(opcao==15){
                    System.out.println("Digite o onibus que deseja excluir (número):");
                    op_oni=input.nextInt();
                    System.out.println("Digite o modelo: ");
                    onibus[op_oni].setModelo(input.nextLine());
                    System.out.println("Digite a marca: ");
                    onibus[op_oni].setMarca(input.nextLine());
                    System.out.println("Digite a Kilometragem: ");
                    onibus[op_oni].setKilometragem(input.nextLine());
                    System.out.println("Digite o ano: ");
                    onibus[op_oni].setAno(input.nextLine());
                }
                //mostrar
                if(opcao==16){
                    System.out.println("Digite o onibus que deseja mostrar (número):");
                    op_oni=input.nextInt();
                    onibus[op_oni].getBus();
                }
        	
        }
        
        
        input.close();
    }
    
}