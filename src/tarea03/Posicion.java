/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 * Esta clase define la posición en un tablero bidimensional mediante dos atributos.
 * Un atributo tipo char para las columnas y un atributo tipo entero para las filas.
 */
public class Posicion {

//Atributos que determinan la posición en un tablero bidimensional.
    private int fila;
    private char columna;

//Constructor para definir los atributos, con valores por defecto alternativos.
    public Posicion(char columna, int fila) {
        if (columna >= 'a' && columna <= 'h') {
            this.columna = columna;
        } else {
            this.columna = 'a';
            System.out.println("Columna inexistente. Columna 'a' seleccionada.");
        }
        if (fila > 0 && fila < 9) {
            this.fila = fila;
        } else {
            this.fila = 1;
            System.out.println("Fila inexistente. Fila '1' seleccionada.");
        }

    }

//Metodo que devuelve ambos atributos de la posición.
    public String toString() {
        return  columna + "" + fila + ". ";
    }

//Metodos getter/setter con valores por defecto alternativos.
    public int getFila() {
        return fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setFila(int fila) {
        if (fila > 0 && fila < 9) {
            this.fila = fila;
        } else {
            this.fila = 1;
            System.out.println("Fila inexistente. Fila '1' seleccionada.");
        }
    }

    public void setColumna(char columna) {
        if (columna >= 'a' && columna <= 'h') {
            this.columna = columna;
        } else {
            this.columna = 'a';
            System.out.println("Columna inexistente. Columna 'a' seleccionada.");
        }
    }
}
