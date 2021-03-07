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
		if(asiento.equals(null) == false){
			cant++;
		}		
	}
	return cant;
}

	void verificarIntegridad() {
		for(Asiento asiento: asientos) {
			if(asiento.registro != registro | motor.registro != registro){
				System.out.println("Las piezas no son originales.");
				break;
			}
		}	
		System.out.println("Auto original");
	}


}