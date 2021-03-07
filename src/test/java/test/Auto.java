package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
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
	return cant; }

	String verificarIntegridad() {	
		String aux="si";
		
		
        for(Asiento asiento: asientos) {
        	if(asiento !=  null) {
        		if(asiento.registro != registro){
            		aux="no";
            	}
        	}
        }
        
        if(motor.registro != registro) {
        	aux ="no";
        }
        
        if(aux.equals("no")) {
        	return "Las piezas no son originales";
        }else {
        	return "Auto original";
        }
	}
	
	
	
}