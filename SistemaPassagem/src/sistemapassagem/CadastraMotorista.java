/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapassagem;

/**
 *
 * @author Luis Marcello Moraes Silva 
 * Gustavo Molina de Souza
 * Pedrenrique Guimarães
 */
public class CadastraMotorista {
	private String cnh;
	private String nome;
	private int diaNasc, mesNasc, anoNasc;
	private Data admissao;
	
	public CadastraMotorista(String cnh, String nome, int diaNasc, int mesNasc, int anoNasc, Data admissao){
		this.cnh = cnh;
		this.nome = nome;
		this.diaNasc = diaNasc;
		this.mesNasc = mesNasc;
		this.anoNasc = anoNasc;
		this.admissao = new Data(diaNasc, mesNasc, anoNasc);
	}
	
	//Alterar Informações*************
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setCnh(String cnh){
		this.cnh = cnh;
	}
	
	public void setDatanasc (int diaNasc,int mesNasc, int anoNasc) {
        this.diaNasc = diaNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
        admissao.setDia(diaNasc);
        admissao.setMes(mesNasc);
        admissao.setAno(anoNasc);
    }
	//Fim de Alterar Informações*************
	
	//Mostrar informações
	public void getMotorista(){
		System.out.println("Nome: " + nome);
		System.out.println("CNH: " + cnh);
		System.out.print("Data de admissao: ");
		admissao.getData();
	}
}
