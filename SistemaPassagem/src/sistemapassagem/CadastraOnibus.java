package sistemapassagem;

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
	private int i = 0;
	private int contador;
	
	CadastraOnibus(String modelo, String marca, int kilometragem, int ano){
		this.modelo = modelo;
		this.marca = marca;
		this.kilometragem = kilometragem;
		this.ano = ano;
	}
	
	public void criarAssentos(int vagas){
		assentos = new int[vagas];
		for(int j = 0; j < vagas; j++){
			assentos[j] = 0;
			contador++;
		}
	}
	
	public void reservarAssentos(){
		int achou = 0;
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
	
	public void getBus(){
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano de Fabricação: " + ano);
		System.out.println("Kilometragem: " + kilometragem);
	}
	
        public void setMarca(String marca){
            this.marca= marca;
        }
	
        public void setModelo(String modelo){
            this.modelo= modelo;
        }
	
        public void setAno(int ano){
            this.ano= ano;
        }
	
        public void setKilometragem(int kilometragem){
            this.kilometragem= kilometragem;
        }	
	
}
