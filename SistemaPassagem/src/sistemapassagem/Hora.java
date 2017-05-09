package sistemapassagem;

/**
 *
 * @author User
 */
public class Hora {
	private int hora = 0;
	private int minutos = 0;
	private int restoDia = 0;
	
	public Hora(int hora, int minutos){
		if(minutos > 60){
			this.minutos = (minutos % 60);
			this.hora = (int) hora + (minutos/60);
		}
		else{
			this.minutos = minutos;
			this.hora = hora;
		}
		if(hora > 24){
			this.hora = (hora%24);
			restoDia = (int) (hora/24);
		}
		else{
			this.hora = hora;
			restoDia = 0;
		}
	}
	
	public void setHora(int hora){
		if(hora < 24){
			this.hora = hora;
		}
		else{
			System.out.println("Hora inválida!");
		}
	}
	
	public void setMinutos(int minutos){
		if(minutos > 60){
			this.minutos = (minutos % 60);
			hora = (int) hora + (minutos/60);
		}
		else{
			this.minutos = minutos;
		}
	}
	
	public int getRestoDia(){
		return restoDia;
	}
	
	public void getHora(){
		System.out.println(hora + ":" + minutos);
	}
}
