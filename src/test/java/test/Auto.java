package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos = new Asiento[4];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	

	int cantidadAsientos(){
	int cant=0;
	for(Asiento asiento: asientos) {
		if(asiento != null){
			cant++;
		}		
	}
	return cant;
	
	}

	String verificarIntegridad() {	
		for(Asiento asiento: asientos) {
			if(asiento.registro == registro && motor.registro == registro) {
		        return "Auto original";
		     }
		 }
			
		return "Las piezas no son originales.";				
	}
	
	
	
}