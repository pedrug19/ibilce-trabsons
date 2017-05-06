/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapassagem;

import java.util.Scanner;

/**
 *
 * @author Luis Marcello Moraes Silva 
 * Gustavo Molina de Souza
 * Pedrenrique Guimarães
 */
public class CadastraOnibus {
	private String modelo;
	private String marca;
	private int kilometragem;
	private int ano;
	private int assentos[];
	private int i;
	private int contador;
	
	private CadastraOnibus(String modelo, String marca, int kilometragem, int ano){
		this.modelo = modelo;
		this.marca = marca;
		this.kilometragem = kilometragem;
		this.ano = ano;
	}
	
	public void criarAssentos(int vagas){
		assentos = new int[vagas];
		for(i = 0; i < vagas; i++){
			assentos[i] = 0;
			contador++;
		}
	}
	
	public void reservarAssentos(){
		int achou = 0;
		i = 0;
		while(achou==0){
			if(contador == 0){
				System.out.println("Onibus cheio!");
				achou = 1;
			}
			else{
				if(assentos[i]==0){
					assentos[i] = 1;
					//TODO: ASSINALAR ASSENTO PARA PASSAGEIRO
					contador--;
					i++;
					achou = 1;
				}
				/*else{
					i++;
				}*/
			}
		}
	}
	
	public void getAssentosLivres(){
		if(contador == 0){
			System.out.println("Não há assentos livres!");
		}
		else{
			System.out.println("Há " + contador + "assentos livres no ônibus.");
		}
	}
	
	//Mover essa função pra Main!
	public void sistemaOnibus(int x){
		Scanner in = new Scanner(System.in);
		CadastraOnibus onibus[] = new CadastraOnibus[100];
		
		System.out.println("Digite o modelo do ônibus: ");
		modelo = in.nextLine();
		
		System.out.println("Digite a marca do ônibus: ");
		marca = in.nextLine();
		
		System.out.println("Digite a kilometragem: ");
		kilometragem = in.nextInt();
		
		System.out.println("Digite o ano de fabricação: ");
		ano = in.nextInt();
	}
}
