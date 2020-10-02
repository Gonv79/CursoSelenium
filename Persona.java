package Practico8;

public class Persona {
    protected String Nombre;
    protected int Telefono;
    protected String Email;
    protected Direccion Domicilio;

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String unNombre) {
        this.Nombre = unNombre;
    }

    public int getTelefono() {
        return Telefono;
    }
    public void setTelefono(int unTelefono) {
        this.Telefono = unTelefono;
    }

    public String getEmail() {
        return Email;
    }
    public void setEmail(String unMail) {
        this.Email = unMail;
    }

    public Direccion getDomicilio() {
        return Domicilio;
    }
    public void setDomicilio(Direccion unaDireccion) {
        this.Domicilio = unaDireccion;
    }

    public Persona(){
        this.Nombre = "Desconocido";
        this.Telefono = 0;
        this.Email = "Desconocido";
    }

    public Persona(String unNombre, int unTel, String unMail, Direccion unaDireccion ) {
        this.Nombre = unNombre;
        this.Telefono = unTel;
        this.Email = unMail;
        this.Domicilio =unaDireccion;
    }

    public String toString() {
        return "Nombre: "+this.getNombre()+", Telefono: "+this.getTelefono()+", Email: "+this.getEmail()+", "+ Domicilio.toString();
        }

}
