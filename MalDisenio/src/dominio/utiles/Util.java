package dominio.utiles;

public class Util {
	
	public static String LPAD(String cadena, int largo, String caracter) {
		String salida=cadena;
		for (int i = 0; i < largo-cadena.length(); i++) {
			salida = caracter + salida ;
		}
		return salida;
	}
	
	public static String LPAD(String cadena, int largo) {
		return LPAD(cadena, largo,"0");
	}
	
	public static String LPAD(int numero, int largo) {
		return LPAD(Integer.toString(numero), largo,"0");
	}
	
}
