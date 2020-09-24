package Practico7;

public class SemiRemolque extends Vehiculo {
    private int cantidadEjes;

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int unaCantidad) {
        this.cantidadEjes = unaCantidad;
    }

    public SemiRemolque() {
        this.ruedas = "Desconocido";
        this.color = "Desconocido";
        this.cantidadEjes = 1;
    }

    public SemiRemolque(String tipoRuedas, String unColor, int unaCantidad) {
        this.ruedas = tipoRuedas;
        this.color = unColor;
        this.cantidadEjes = unaCantidad;
    }

    public String toString() {
        return "El Semi Remolque " + super.toString() + " La cantidad de ejes es " + this.getCantidadEjes() + ".";
    }

}
