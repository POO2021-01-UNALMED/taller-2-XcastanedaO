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
	return cant;
}

	void verificarIntegridad() {
		for(Asiento asiento: asientos) {
			/*if(asiento.registro != registro) {
				System.out.println("Las piezas no son originales.");
				break;
			}else if(motor.registro != registro){
				System.out.println("Las piezas no son originales.");
			}*/
			
			if(asiento.registro == registro & motor.registro == registro) {
				System.out.println("Auto original");
			}
		}
		System.out.println("Las piezas no son originales.");
				
		
	}


}