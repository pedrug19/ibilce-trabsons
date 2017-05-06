package sistemapassagem;
import java.util.Scanner;
/**
 *
 * @author Luis Marcello Moraes Silva 
 * Gustavo Molina de Souza
 * Pedrenrique Guimarães
 */
public class SistemaPassagem {
    public static void main(String[] args) {
        int dia, mes, ano, hora, minutos, origem, destino, kilometragem, i, opcao;
        String nome, rg, profissao, cnh, modelo, marca, endereco;
        Scanner input = new Scanner(System.in);
        CadastraPassageiro passageiro[] = new CadastraPassageiro[3];
        
        /*TODO: FAZER SISTEMA PARA CADASTRAR CADA UM DOS DADOS
         * 	CONSERTAR O ERRO DO SCANNER PULAR UM DADO
         * Teste Passageiro*/
        
        for(i = 0; i < 3; i++){
        	System.out.println("Cadastrar Passageiro: ");
        	System.out.println("Digite o nome do passageiro: ");
        	nome = input.nextLine();
        	System.out.println("Digite o rg: ");
        	rg = input.nextLine();
        	System.out.print("Digite o dia de nascimento: ");
        	dia = input.nextInt();
        	System.out.print("Digite o mês de nascimento: ");
        	mes = input.nextInt();
        	System.out.print("Digite o ano de nascimento: ");
        	ano = input.nextInt();
        	System.out.println("Digite a profissão: ");
        	profissao = input.nextLine();
        	System.out.println("Digite o endereço: ");
        	endereco = input.nextLine();
        	passageiro[i] = new CadastraPassageiro(nome, rg, profissao, endereco, dia, mes, ano);
        }
        for(i = 0; i < 3; i++){
        	passageiro[i].getPassageiro();
        }
    }
    
}
