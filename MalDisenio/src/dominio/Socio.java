package dominio;

public class Socio {
	public String apellido;
	public String nombre;
	public String calleSocio;
	public String numeroCalleSocio;
	public String localidad;

	public Socio(String apellido, String nombre, String calleSocio, String numeroCalleSocio, String localidad) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.calleSocio = calleSocio;
		this.numeroCalleSocio = numeroCalleSocio;
		this.localidad = localidad;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalleSocio() {
		return this.calleSocio;
	}

	public void setCalleSocio(String calleSocio) {
		this.calleSocio = calleSocio;
	}

	public String getNumeroCalleSocio() {
		return this.numeroCalleSocio;
	}

	public void setNumeroCalleSocio(String numeroCalleSocio) {
		this.numeroCalleSocio = numeroCalleSocio;
	}

	public String getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

}
