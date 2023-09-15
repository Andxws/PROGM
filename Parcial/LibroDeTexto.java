public class LibroDeTexto extends Libro {
    private String curso;
    
    public LibroDeTexto(String titulo, String autor, String curso) {
        super(titulo, autor, 0);
        this.curso = curso;
    }
    
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Curso: " + curso);
    }
    
    public String getCurso() {
        return curso;
    }
    
    public void setCurso(String curso) {
        this.curso = curso;
    }
}