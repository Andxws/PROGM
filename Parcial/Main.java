public class Main {

  

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Crear un objeto de la clase Libro
        final Libro libro = new Libro("El Quijote de la Mancha", "Miguel de Cervantes", 120000);
        libro.imprimirInformacion();

        // Crear un objeto de la clase LibroDeTexto
        final LibroDeTexto libroDeTexto = new LibroDeTexto("Fundamentos de Programación", "Bard", "Programación");
        libroDeTexto.imprimirInformacion();
    }
}
