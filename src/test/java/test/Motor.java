package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int NumRegistro) {
		registro = NumRegistro;
	}
		
	void asignarTipo(String TipoMotor) {
		if(TipoMotor.equals("electrico")) {
			tipo = TipoMotor;
		}else if(TipoMotor.equals("gasolina")) {
			tipo = TipoMotor;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
