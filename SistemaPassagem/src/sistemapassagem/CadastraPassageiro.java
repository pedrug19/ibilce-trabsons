package sistemapassagem;

/**
 *
 * @author Luis Marcello Moraes Silva 
 * Gustavo Molina de Souza
 * Pedrenrique Guimarães
 */

public class CadastraPassageiro {
	private String nome, rg, profissao, endereco;
	private int diaNasc, mesNasc, anoNasc;
	private Data data;
	
	public CadastraPassageiro(String nome, String rg, String profissao, String endereco, int diaNasc, int mesNasc, int anoNasc){
		this.nome = nome;
		this.rg = rg;
		this.profissao = profissao;
		this.endereco = endereco;
		this.diaNasc = diaNasc;
		this.mesNasc = mesNasc;
		this.anoNasc = anoNasc;
		this.data = new Data(diaNasc, mesNasc, anoNasc);
	}
	
	//Alterar Informações*************
	public void setNome(String nome){
        this.nome = nome;
    }
   
    public void setRg (String rg){
        this.rg = rg;
    }
    
    public void setProfissao (String profissao){
        this.profissao = profissao;
    }
    
    public void setEndereco (String endereco){
        this.endereco = endereco;
    }
    
    public void setDatanasc (int diaNasc, int mesNasc, int anoNasc) {
        data.setDia(diaNasc);
        data.setMes(mesNasc);
        data.setAno(anoNasc);
    }
	//Fim de Alterar Informações*************
    
    //Mostrar informações
	public void getPassageiro(){
		System.out.println("Nome: " + nome);
		System.out.println("RG: " + rg);
		System.out.println("Profissão: " + profissao);
		System.out.println("Endereço: " + endereco);
		data.getData();
		
	}
}
