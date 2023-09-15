 public class Libro{
    private String titulo;
    private String autor;
    private float precio;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void imprimirInformacion(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: " + precio);


    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

 