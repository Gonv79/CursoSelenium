package Practico8;

public class Direccion {
    private String Calle;
    private String Ciudad;
    private String Estado;
    private String Pais;

    public String getCalle() {
        return Calle;
    }
    public void setCalle(String unaCalle) {
        this.Calle = unaCalle;
    }

    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String unaCiudad) {
        this.Ciudad = unaCiudad;
    }

    public String getEstado() {
        return Estado;
    }
    public void setEstado(String unEstado) {
        this.Estado = unEstado;
    }

    public String getPais() {
        return Pais;
    }
    public void setPais(String unPais) {
        this.Pais = unPais;
    }

    public Direccion() {
        this.Calle = "Desconocido";
        this.Ciudad = "Desconocido";
        this.Estado = "Desconocido";
        this.Pais = "Desconocida";
    }

    public Direccion(String unaCalle, String unaCiudad, String unEstado, String unPais) {
        this.Calle = unaCalle;
        this.Ciudad = unaCiudad;
        this.Estado = unEstado;
        this.Pais = unPais;
    }

    public String toString() {
        return "Direccion: "+this.Calle +", "+this.Ciudad +", "+this.Estado +", "+this.Pais +".";
    }

    public static int obtenerCodigoTel(){
        return 054;
    }
}
