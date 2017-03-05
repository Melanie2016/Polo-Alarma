package ar.edu.unlam.polo.composicion.alarma;

public class Sensor {

	private Boolean estado; // true= activo false= desactivo

	
	public Sensor(){
		this.estado = false;
	}
	
	public void activarSensor(){
		
		this.estado = true;
	}
	
	public Boolean desactivarSensor(){
		
		if (this.estado == true){
			return estado = false;
		}
		else{
			return true;
		}
	}
	
	public Boolean estaActivo(){
			
			return estado;
		
	}

	
}
