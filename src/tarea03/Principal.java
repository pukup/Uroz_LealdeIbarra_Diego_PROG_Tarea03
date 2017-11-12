/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

import utilidades.Entrada;

/**
 *
 * @author pukup
 */
public class Principal {

    public static void main(String[] args) {

        Rey rey;
        int num_color;
        int num_menu;
        int num_direccion;

        do {
            System.out.printf("Introduzca un número: %n 1-Para seleccionar rey negro %n 2-Para seleccionar rey blanco %n");
            num_color = Entrada.entero();
        } while (num_color < 1 || num_color > 2);

        if (num_color == 1) {
            rey = new Rey(Color.NEGRO);
        } else {
            rey = new Rey(Color.BLANCO);
        }

        Posicion posicion = rey.getPosicion();

        do {
            int posicion_fila = posicion.getFila();
            int posicion_columna = posicion.getColumna();
            System.out.printf("Introduzca un número: %n 1-Para desplazar el rey. %n 2-Mostrar la información del rey. %n 3-Salir del programa. %n");
            num_menu = Entrada.entero();
            switch (num_menu) {
                case 1:
                    do {
                        System.out.printf("Introduzca un número: %n 1-%7$s %4$s%2$s %n 2-%7$s %4$s%3$s%n 3-%7$s %5$s%1$s%n 4-%7$s %6$s%1$s%n 5-%7$s %5$s%2$s%n 6-%7$s %5$s%3$s%n 7-%7$s %6$s%2$s%n 8-%7$s %6$s%3$s%n", posicion_fila, posicion_fila + 1, posicion_fila - 1, ((char) (posicion_columna)), ((char) (posicion_columna + 1)), ((char) (posicion_columna - 1)), "Para mover a la casilla");
                        num_direccion = Entrada.entero();
                    } while (num_direccion < 1 || num_direccion > 8);
                    switch (num_direccion) {
                        case 1:
                            rey.Mueve(Direccion.NORTE);
                            break;
                        case 2:
                            rey.Mueve(Direccion.SUR);
                            break;
                        case 3:
                            rey.Mueve(Direccion.ESTE);
                            break;
                        case 4:
                            rey.Mueve(Direccion.OESTE);
                            break;
                        case 5:
                            rey.Mueve(Direccion.NORESTE);
                            break;
                        case 6:
                            rey.Mueve(Direccion.SURESTE);
                            break;
                        case 7:
                            rey.Mueve(Direccion.NOROESTE);
                            break;
                        case 8:
                            rey.Mueve(Direccion.SUROESTE);
                            break;
                    }
                    break;

                case 2:
                    System.out.println("Rey " + rey.getColor() + ": " + rey.getPosicion());
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Fin del programa.");
                    break;
            }

        } while (num_menu != 3);
    }
}
