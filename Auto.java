package Practico7;

public class Auto extends Vehiculo {
    private int velocidadMáxima;
    private String cilindrada;

    public int getVelocidadMáxima() {
        return velocidadMáxima;
    }

    public void setVelocidadMáxima(int unaVelocidad) {
        this.velocidadMáxima = unaVelocidad;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String unaCilindrada) {
        this.cilindrada = unaCilindrada;
    }

    public Auto() {
        this.ruedas = "Desconocido";
        this.color = "Desconocido";
        this.velocidadMáxima = 200;
        this.cilindrada = "Desconocida";
    }

    public Auto(String tipoRuedas, String unColor, int unaVelocidad, String unaCilindrada) {
        this.ruedas = tipoRuedas;
        this.color = unColor;
        this.velocidadMáxima = unaVelocidad;
        this.cilindrada = unaCilindrada;
    }

    public String toString() {
        return "El auto " + super.toString() + " Su Velocidad maxima es de " + this.getVelocidadMáxima() + " y su cilindrada es de " + this.getCilindrada() + ".";
    }


}
