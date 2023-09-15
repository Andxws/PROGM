public class Main {
    public static void main(String[] args) {
        LibroUNIAJC libroIUAC = new LibroUNIAJC("Fundamentos de Programación", "UNIAJC", "Programación", "Ingenierías");
        Novela novela = new Novela("El lobo del Mar", "Jack Londom", "Aventuras");
        
        libroIUAC.setPrecio(45000);
        novela.setPrecio(33000);
        
        libroIUAC.imprimirInformacion();
        System.out.println("------------------------");
        novela.imprimirInformacion();
    }
}