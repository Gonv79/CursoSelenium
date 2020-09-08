package Practico5;

import java.util.Scanner;

public class Libreria {
    public static void main (String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("** Ingrese Datos del libro 1 ** ");
        Libro primerLibro=pedirDatos(input);
        System.out.println("** Ingrese Datos del libro 2 ** ");
        Libro segundoLibro=pedirDatos(input);

        System.out.println(primerLibro);
        System.out.println(segundoLibro);

    }

    public static Libro pedirDatos (Scanner input){
        System.out.println("Ingrese numero ISBN del libro: ");
        int userISBN=input.nextInt();
        input.nextLine();
        System.out.println("Ingrese Titulo del libro: ");
        String userTitulo=input.nextLine();
        System.out.println("Ingrese Autor del libro: ");
        String userAutor=input.nextLine();
        System.out.println("Ingrese numero de paginas del libro: ");
        int userNumeroPaginas=input.nextInt();
        Libro nuevoLibro=new Libro(userISBN, userAutor, userTitulo, userNumeroPaginas);
        return nuevoLibro;
    }
}
