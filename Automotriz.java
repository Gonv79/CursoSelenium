package Practico7;

public class Automotriz {
    public static void main(String args[]) {
        Vehiculo moto1 = new Motocicleta("Cubierta 110", "Verde", 300, "72 cc");
        Vehiculo moto2 = new Motocicleta();
        Vehiculo semi1 = new SemiRemolque("Cubierta 110", "Azul", 2);
        Vehiculo semi2 = new SemiRemolque();

        System.out.println("Motocicletas:");
        System.out.println(moto1);
        System.out.println(moto2);
        System.out.println("Semiremolque:");
        System.out.println(semi1);
        System.out.println(semi2);
    }
}
