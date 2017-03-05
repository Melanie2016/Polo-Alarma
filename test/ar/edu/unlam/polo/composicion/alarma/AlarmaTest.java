package ar.edu.unlam.polo.composicion.alarma;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.polo.composicion.alarma.Alarma;
import ar.edu.unlam.polo.composicion.alarma.Sensor;

public class AlarmaTest {


	@Test 
	public void testQueUnaAlarmaSePrenda(){
		
		Sensor sensor1 = new Sensor();
		Sensor sensor2 = new Sensor();
		Sensor sensor3 = new Sensor();
		
		Alarma miAlarma = new Alarma("1234",sensor1,sensor2,sensor3);
		miAlarma.prender("1234");
		
		Assert.assertTrue(miAlarma.getPrendido()); 
		//getPrendido--> porque es un atributo boolean y el prender (metodo) no;
	}
	
	@Test
	public void testQueUnaAlarmaPrendidaSeActive() {
		
		Sensor sensor1 = new Sensor();
		Sensor sensor2 = new Sensor();
		Sensor sensor3 = new Sensor();
		
		sensor3.activarSensor();
		
		Alarma miAlarma = new Alarma("1234",sensor1,sensor2,sensor3);

		miAlarma.prender("1234");
	
		
		Assert.assertTrue(miAlarma.isActiva());
	}
	
	@Test
	public void queUnaAlarmaApagadaNoSeActive(){
		
		Sensor sensor1 = new Sensor();
		Sensor sensor2 = new Sensor();
		Sensor sensor3 = new Sensor();
		
		sensor1.activarSensor();
		
		Alarma miAlarma = new Alarma("1234",sensor1,sensor2,sensor3);

		miAlarma.apagar("1234");
			
		Assert.assertFalse(miAlarma.getPrendido());
		
		Assert.assertFalse(miAlarma.isActiva());
	}

	@Test
	public void queUnaAlarmaSeApage(){

		Sensor sensor1 = new Sensor();
		Sensor sensor2 = new Sensor();
		Sensor sensor3 = new Sensor();
		
		sensor2.activarSensor();
		
		Alarma miAlarma = new Alarma("1234",sensor1,sensor2,sensor3);
		
		miAlarma.apagar("1234");
		
		Assert.assertFalse(miAlarma.getPrendido());
	}
}
