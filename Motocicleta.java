package Practico7;

public class Motocicleta extends Vehiculo{
    private int velocidad;
    private String cilindrada;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int unaVelocidad) {
        this.velocidad = unaVelocidad;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String unaCilindrada) {
        this.cilindrada = unaCilindrada;
    }

    public Motocicleta() {
        this.ruedas = "Desconocido";
        this.color = "Desconocido";
        this.velocidad = 200;
        this.cilindrada = "Desconocida";
    }

    public Motocicleta(String tipoRuedas, String unColor, int unaVelocidad, String unaCilindrada) {
        this.ruedas = tipoRuedas;
        this.color = unColor;
        this.velocidad = unaVelocidad;
        this.cilindrada = unaCilindrada;
    }

    public String toString() {
        return "La motocicleta " + super.toString() + " Su Velocidad es de " + this.getVelocidad() + " y su cilindrada es " + this.getCilindrada() + ".";
    }

}
