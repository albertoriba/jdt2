package dominio;

public class Libro {

	public String apellidoAutor;
	public String nombreAutor;
	public String calleAutor;
	public String numeroCalleAutor;
	public String titulo;
	public String editorial;
	public String anioEdicion;

	public Fecha fechaPrestamo;
	public Fecha fechaDevolucion;
	public boolean prestado;
	public Socio ultimoSocio;

	public Libro(String apellidoAutor, String nombreAutor, String calleAutor, String numeroCalleAutor, String titulo,
			String editorial, String anioEdicion) {
		this.apellidoAutor = apellidoAutor;
		this.nombreAutor = nombreAutor;
		this.calleAutor = calleAutor;
		this.numeroCalleAutor = numeroCalleAutor;
		this.titulo = titulo;
		this.editorial = editorial;
		this.anioEdicion = anioEdicion;
	}

	public String getApellidoAutor() {
		return this.apellidoAutor;
	}

	public void setApellidoAutor(String apellidoAutor) {
		this.apellidoAutor = apellidoAutor;
	}

	public String getNombreAutor() {
		return this.nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getCalleAutor() {
		return this.calleAutor;
	}

	public void setCalleAutor(String calleAutor) {
		this.calleAutor = calleAutor;
	}

	public String getNumeroCalleAutor() {
		return this.numeroCalleAutor;
	}

	public void setNumeroCalleAutor(String numeroCalleAutor) {
		this.numeroCalleAutor = numeroCalleAutor;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getAnioEdicion() {
		return this.anioEdicion;
	}

	public void setAnioEdicion(String anioEdicion) {
		this.anioEdicion = anioEdicion;
	}

	public Fecha getFechaPrestamo() {
		return this.fechaPrestamo;
	}

	public void setFechaPrestamo(Fecha fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Fecha getFechaDevolucion() {
		return this.fechaDevolucion;
	}

	public void setFechaDevolucion(Fecha fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public boolean isPrestado() {
		return this.prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	public Socio getUltimoSocio() {
		return this.ultimoSocio;
	}

	public void setUltimoSocio(Socio ultimoSocio) {
		this.ultimoSocio = ultimoSocio;
	}

	public void cambiarEstado() {
		this.prestado = !this.prestado;
	}

	public boolean registrarPrestamo(Socio s, Fecha inicio) {
		this.ultimoSocio = s;
		this.fechaPrestamo = inicio;
		return true;
	}

	boolean

	boolean registrarDevolucion()

}
