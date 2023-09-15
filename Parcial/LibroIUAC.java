public class LibroIUAC extends LibroDeTexto {
    private String facultad;
    
    public LibroIUAC(String titulo, String autor, String curso, String facultad) {
        super(titulo, autor, curso);
        this.facultad = facultad;
    }
    
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Facultad: " + facultad);
    }
    
    public String getFacultad() {
        return facultad;
    }
    
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
}