import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar la coleccion de objetos
		/* indice 0 */Mascotas mascota1 = new Mascotas("Capulina", "Pitbull", 1, 3500);
		/* indice 1 */Mascotas mascota2 = new Mascotas("Bambi", "Chihuahua", 1, 2400);
		/* indice 2 */Mascotas mascota3 = new Mascotas("Burbuja", "Maltes", 2, 2300);

		// Declarar mi lista
		// Que es una libreria: Es un conjunto de clases desarrollados por alguien mas
		// para para que nuestras aplicaciones funcionen correctamente
		List<Mascotas> lista = new ArrayList<Mascotas>();

		// Tiene los metodos del crud basico

		// Guardar---o agregar elementos a lista .add
		lista.add(mascota1);
		lista.add(mascota2);
		lista.add(mascota3);

		// Mostrar
		System.out.println(lista);

		// Buscar----por indice ---- .get(indice)
		Mascotas mascotaEncont = null; // Reserva de espacio en memoria

		mascotaEncont = lista.get(1);

		System.out.println("Se encontro el registro " + mascotaEncont);

		// Para editar primero hay que buscar
		mascotaEncont = lista.get(0);
		// Actualizo el objeto
		mascotaEncont.setNombre("Bobby");
		// Actualizar a la lista----.set(indice, elemento para actualizar)
		lista.set(0, mascotaEncont);

		// Mostrar
		System.out.println(lista);

		// Eliminar .remove(indice)
		lista.remove(2);

		// Mostra
		System.out.println(lista);

		// Buscar por nombre de la mascota Bambi
		// Mostrar el total de dinero invertido

		// Realizar la logica
		// Ciclos--for normal o el foreach
		// Condicional --- if ---- boleanos

	}

}
