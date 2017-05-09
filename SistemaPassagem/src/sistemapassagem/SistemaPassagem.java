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
		Scanner input = new Scanner(System.in);
        List<CadastraOnibus> listaOnibus = new ArrayList<CadastraOnibus>();
        List<CadastraPassageiro> listaPassageiro = new ArrayList<CadastraPassageiro>();
        List<CadastraRota> listaRota = new ArrayList<CadastraRota>();
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
            	CadastraPassageiro passageiro = new CadastraPassageiro(nome, rg, profissao, endereco, dia, mes, ano);
            	listaPassageiro.add(passageiro);
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
            	
            	CadastraMotorista motorista = new CadastraMotorista(nome, cnh, dia, mes, ano, admissao);
            	listaMotorista.add(motorista);
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
        	
        }
        
        input.close();
    }
    
}
