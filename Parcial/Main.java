public class Main {
    public static void main(String[] args) {
        LibroUNIAJC libroIUAC = new LibroUNIAJC("Libro de texto IUAC", "Autor IUAC", "Curso UNIAJC", "Facultad IUAC");
        Novela novela = new Novela("Novela de aventuras", "Autor de la novela", "Aventuras");
        
        libroIUAC.setPrecio(29.99f);
        novela.setPrecio(19.99f);
        
        libroIUAC.imprimirInformacion();
        System.out.println("------------------------");
        novela.imprimirInformacion();
    }
}