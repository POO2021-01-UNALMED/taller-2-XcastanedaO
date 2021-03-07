package test;

public class Asiento {
	String color;
	int precio;
	int registro;
	
	
	void cambiarColor(String color) {
		if(color.equals("rojo")) {
			this.color = "rojo";
		}else if(color.equals("verde")) {
			this.color = "verde";
		}else if(color.equals("amarillo")) {
			this.color = "amarillo";
		}else if(color.equals("negro")) {
			this.color = "negro";	
		}else if(color.equals("blanco")) {
			this.color = "blanco";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
