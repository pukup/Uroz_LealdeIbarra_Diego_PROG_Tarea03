/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 *
 * @author lol
 *
 */
public class Posicion {

    private int fila;
    private char columna;

    public void setPosicion(char columna, int fila) {
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

    public int getFila() {
        return this.fila;
    }

    public char getColumna() {
        return this.columna;
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
