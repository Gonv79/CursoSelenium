package Practico8;

public class Profesor extends Persona{
    private float Salario;

    public float getSalario() {
        return Salario;
    }
    public void setSalario(float unSalario) {
        Salario = unSalario;
    }

    public Profesor (String unNombre, int unTel, String unMail, Direccion unaDireccion, float unSalario ) {
        this.Nombre=unNombre;
        this.Telefono=unTel;
        this.Email=unMail;
        this.Domicilio=unaDireccion;
        this.Salario=unSalario;
    }

    public String toString() {
      return super.toString() + " Su salario es: "+this.getSalario()+".";
    }


}
