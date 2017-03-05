package ar.edu.unlam.polo.composicion.alarma;

public class Alarma {
	
	private String codigo;
	private Boolean prendido;
	private Sensor s1;
	private Sensor s2;
	private Sensor s3;
	
	public Alarma(String codigo, Sensor movimiento, Sensor sonido, Sensor contacto) {
		this.codigo = codigo;
		this.s1 = movimiento;
		this.s2 = sonido;
		this.s3 = contacto;	
	}

	public void apagar(String codigo){
	
		if(this.codigo.equals(codigo)){
			
			this.prendido = false;
		}
		
	}
	
	public void prender( String codigo) {
		
		if (this.codigo.equals(codigo)){
			
			this.prendido = true;
		}
		 
	}
	
	
	public Boolean isActiva(){
		
		if(this.prendido){
			
			return (s1.estaActivo()||s2.estaActivo()||s3.estaActivo());

		}
		else{
			return false;
		}
	}

	
	
	
	//get y set
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Boolean getPrendido() {
		return prendido;
	}

	public void setPrendido(Boolean prendido) {
		this.prendido = prendido;
	}

	public Sensor getS1() {
		return s1;
	}

	public void setS1(Sensor s1) {
		this.s1 = s1;
	}

	public Sensor getS2() {
		return s2;
	}

	public void setS2(Sensor s2) {
		this.s2 = s2;
	}

	public Sensor getS3() {
		return s3;
	}

	public void setS3(Sensor s3) {
		this.s3 = s3;
	}
	
	
	
}
