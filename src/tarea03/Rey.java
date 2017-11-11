/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 *
 * @author pukup
 */
public class Rey {

    private Color color;
    private Posicion posicion;

    public Rey() {
        this.color = Color.BLANCO;
        this.posicion = new Posicion('e', 1);
    }

    public Rey(Color color) {
        switch (color) {
            case BLANCO:
                this.color = Color.BLANCO;
                this.posicion = new Posicion('e', 1);
                break;
            case NEGRO:
                this.color = Color.NEGRO;
                this.posicion = new Posicion('e', 8);
                break;
        }
    }

    public Color getColor() {
        return color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public String toString() {
        return color + ": " + posicion;
    }

    public void Mueve(Direccion direccion) {

        int fila = posicion.getFila();
        int numero_columna = posicion.getColumna();
        
        switch (direccion) {
            case NORTE:
                Ilegal(Direccion.NORTE);
                posicion.setFila(fila + 1);
                break;
            case SUR:
                Ilegal(Direccion.SUR);
                posicion.setFila(fila - 1);
                break;
            case ESTE:
                Ilegal(Direccion.ESTE);
                posicion.setColumna((char) (numero_columna + 1));
                break;
            case OESTE:
                Ilegal(Direccion.OESTE);
                posicion.setColumna((char) (numero_columna - 1));
                break;
            case NORESTE:
                Ilegal(Direccion.NORESTE);
                posicion.setFila(fila + 1);
                posicion.setColumna((char) (numero_columna + 1));
                break;
            case SURESTE:
                Ilegal(Direccion.SURESTE);
                posicion.setFila(fila - 1);
                posicion.setColumna((char) (numero_columna + 1));
                break;
            case NOROESTE:
                Ilegal(Direccion.NOROESTE);
                posicion.setFila(fila + 1);
                posicion.setColumna((char) (numero_columna - 1));
                break;
            case SUROESTE:
                Ilegal(Direccion.SUROESTE);
                posicion.setFila(fila - 1);
                posicion.setColumna((char) (numero_columna - 1));
                break;
        }

    }

    private void Ilegal(Direccion direccion) {

        int fila = posicion.getFila();
        int columna = posicion.getColumna();

        switch (direccion) {
            case NORTE:
                if (fila + 1 < 1 || fila + 1 > 8) {
                    System.out.print("Movimiento ilegal por ");
                }
                break;
            case SUR:
                if (fila - 1 < 1 || fila - 1 > 8) {
                    System.out.print("Movimiento ilegal por ");
                }
                break;
            case ESTE:
                if (columna + 1 < 'a' || columna + 1 > 'h') {
                    System.out.print("Movimiento ilegal por ");
                }
                break;
            case OESTE:
                if (columna - 1 < 'a' || columna - 1 > 'h') {
                    System.out.print("Movimiento ilegal por ");
                }
                break;
            case NORESTE:
                if (fila + 1 < 1 || fila + 1 > 8) {
                    System.out.print("Movimiento ilegal por ");
                }
                if (columna + 1 < 'a' || columna + 1 > 'h') {
                    System.out.print("Movimiento ilegal por ");
                }
                break;
            case SURESTE:
                if (fila - 1 < 1 || fila - 1 > 8) {
                    System.out.print("Movimiento ilegal por ");
                }
                if (columna + 1 < 'a' || columna + 1 > 'h') {
                    System.out.print("Movimiento ilegal por ");
                }
                break;
            case NOROESTE:
                if (fila + 1 < 1 || fila + 1 > 8) {
                    System.out.print("Movimiento ilegal por ");
                }
                if (columna - 1 < 'a' || columna - 1 > 'h') {
                    System.out.print("Movimiento ilegal por ");
                }
                break;
            case SUROESTE:
                if (fila - 1 < 1 || fila - 1 > 8) {
                    System.out.print("Movimiento ilegal por ");
                }
                if (columna - 1 < 'a' || columna - 1 > 'h') {
                    System.out.print("Movimiento ilegal por ");
                }
                break;
        }

    }

}
