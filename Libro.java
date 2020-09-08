package Practico5;

public class Libro {

    // Atributos
    private int ISBN;
    private String autor;
    private String titulo;
    private int numeroDePaginas;

    //Set y Get
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int unISBN) {
        this.ISBN = unISBN;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String unAutor) {
        this.autor = unAutor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String unTitulo) {
        this.titulo = unTitulo;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }
    public void setNumeroDePaginas(int unNumeroDePaginas) {
        this.numeroDePaginas = unNumeroDePaginas;
    }

    //Contructores

    public Libro(){
       this.ISBN=0;
       this.autor="Desconocido";
       this.titulo="Sin título";
       this.numeroDePaginas=0;
    }

    public Libro(int unISBN, String unAutor, String unTitulo, int unNumero){
        this.ISBN=unISBN;
        this.autor=unAutor;
        this.titulo=unTitulo;
        this.numeroDePaginas=unNumero;
    }

    // Funciones

    public String toString () {
        String autor="";
        if (this.getAutor().isEmpty()||this.getAutor() == null){
            autor="Desconocido";
        }else{
            autor=this.getAutor();
        }
        String retorno = "El libro con ISBN "+ this.getISBN() +" creado por el autor "+ autor +" tiene "+this.getNumeroDePaginas()+" páginas";
        return retorno;
    }


}
