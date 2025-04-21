
public class Mascotas {
	private String nombre;
	private String raza;
	private int edad;
	private float precio;

	// Este es un constructor con todos los paramtros
	public Mascotas(String nombre, String raza, int edad, float precio) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", precio=" + precio + "]\n";
	}

	//Encapsulamiento
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
