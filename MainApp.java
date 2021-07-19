package ejercicio3;

public class MainApp {

	public static void main(String[] args) {

		Libro libro2 = new Libro(5432132, "Harry Potter", "Pablo Bernal", 250);
		Libro libro3 = new Libro(6223415, "El señor de los anillos", "Pablo Bernal", 300);

		if (libro2.compareTo(libro3) == 1) {
			System.out.println(libro2);
			System.out.println("El libro " + libro2.getTitulo() + " tiene mas paginas.");
		} else if (libro2.compareTo(libro3) == -1) {
			System.out.println(libro3);
			System.out.println("El libro " + libro3.getTitulo() + " tiene mas paginas.");
		} else {
			System.out.println("Ambos  libros tienen el mismo numero de paginas");
		}

	}

}
