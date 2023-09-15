public class Novela extends Libro {
    private String tipo;
    
    public Novela(String titulo, String autor, String tipo) {
        super(titulo, autor, 0);
        this.tipo = tipo;
    }
    
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Tipo: " + tipo);
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
 