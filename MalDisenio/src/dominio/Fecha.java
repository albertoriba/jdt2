package dominio;

import static dominio.utiles.Util.LPAD;

import java.util.Calendar;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	private static int[] duracion = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static String[] diaDeSemana = { "Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };
	private static String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
			"Septiembre", "Octubre", "Noviembre", "Diciembre" };

	public static void main(String[] args) {
		int d = 0;
		int m = 0;
		int a = 0;
		for (int i = 0; i < 12; i++) {
			m = (int) (1 + (Math.random() * 11));
			d = (int) (1 + (Math.random() * duracion[m - 1]));
			a = (int) (1990 + (Math.random() * 30));

			System.out.println("@Test");
			System.out.println("void testFechaCorta" + LPAD(i, 2) + "() {");
			System.out.println("\t//Arrange");
			System.out.println("\tfinal String expected = \"" + LPAD(d, 2) + "/" + LPAD(m, 2) + "/" + a + "\";");
			System.out.println("\t//Act");
			System.out.println("\tfinal Fecha f = new Fecha(" + d + "," + m + "," + a + ");");
			System.out.println("\tfinal String actual =f.getFechaCorta();");
			System.out.println("\t//Assert");
			System.out.println("\tassertEquals(expected,actual);");
			System.out.println("}");
		}

		for (int i = 0; i < 50; i++) {
			m = (int) (1 + (Math.random() * 11));
			d = (int) (1 + (Math.random() * duracion[m - 1]));
			a = (int) (1990 + (Math.random() * 30));

			System.out.println("@Test");
			System.out.println("void testFechaLarga" + LPAD(i, 2) + "() {");
			System.out.println("\t//Arrange");
			System.out.println("\tfinal String expected = \"" + new Fecha(d, m, a).getFechaLarga() + "\";");
			System.out.println("\t//Act");
			System.out.println("\tfinal Fecha f = new Fecha(" + d + "," + m + "," + a + ");");
			System.out.println("\tfinal String actual =f.getFechaLarga();");
			System.out.println("\t//Assert");
			System.out.println("\tassertEquals(expected,actual);");
			System.out.println("}");
		}
		Fecha f = new Fecha(18, 5, 2018);
		System.out.println(f.getFechaLarga());
	}

	public Fecha() {
		this.dia = 1;
		this.mes = 1;
		this.anio = 1970;
	}

	public Fecha(int dia, int mes, int anio) {
		this();
		if (esFechaValida(dia, mes, anio)) {
			this.dia = dia;
			this.mes = mes;
			this.anio = anio;
		}
	}

	private boolean esFechaValida(int dia2, int mes2, int anio2) {
		if ((mes2 < 1) || (mes2 > 12)) {
			return false;
		}
		if ((dia2 < 1) || (dia2 > duracion[mes2 - 1])) {
			return false;
		}
		return true;
	}

	public String getFechaCorta() {
		return LPAD(Integer.toString(dia), 2) + "/" + LPAD(Integer.toString(mes), 2) + "/" + anio;
	}

	public String getFechaLarga() {
		return getDiaSemana() + " " + dia + " de " + meses[mes - 1] + " de " + anio;
	}

	private String getDiaSemana() {
		Calendar c = Calendar.getInstance();
		c.set(anio, mes - 1, dia);
		return diaDeSemana[c.get(Calendar.DAY_OF_WEEK) - 1];
	}

	public boolean mayorEstrictoA(Fecha otraFecha) {
		if (this.anio > otraFecha.anio) {
			return true;
		} else if (this.anio == otraFecha.anio) {
			if (this.mes > otraFecha.mes) {
				return true;
			} else if (this.mes == otraFecha.mes) {
				if (this.dia > otraFecha.dia) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean menorOIgualA(Fecha otraFecha) {
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + anio;
		result = (prime * result) + dia;
		result = (prime * result) + mes;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Fecha other = (Fecha) obj;
		if (anio != other.anio) {
			return false;
		}
		if (dia != other.dia) {
			return false;
		}
		if (mes != other.mes) {
			return false;
		}
		return true;
	}

}
