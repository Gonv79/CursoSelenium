package Practico7;

public class Vehiculo {
    protected String ruedas;
    protected String color;

    public String getRuedas() {
        return ruedas;
    }

    public void setRuedas(String tipoRuedas) {
        this.ruedas = tipoRuedas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String unColor) {
        this.color = unColor;
    }

    public Vehiculo() {
        this.ruedas = "Desconocido";
        this.color = "Desconocido";
    }

    public Vehiculo(String tipoRuedas, String unColor) {
        this.ruedas = tipoRuedas;
        this.color = unColor;
    }

    public String toString() {
        return "tiene ruedas del tipo " + this.getRuedas() + " y es de color " + this.getColor() + ".";
    }
}
