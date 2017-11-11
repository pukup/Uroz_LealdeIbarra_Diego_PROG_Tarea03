/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 * Esta clase define color y posición de un rey mediante dos atributos.
 * Un atributo tipo enumerado "Color" y una instancia "posición" de la clase "Posicion".
 * Dispone de metodos "getter", "toString" y el metodo "Mueve" que actualiza la posición de las instancias creadas.
 */
public class Rey {
    
//Atributos que determinan color y posición.
    private Color color;
    private Posicion posicion;

//Constructor para los atributos por defecto.    
    public Rey() {
        this.color = Color.BLANCO;
        this.posicion = new Posicion('e', 1);
    }
    
//Constructor para definir el color con una posición asociada por defecto.
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

    
//Metodos getter.    
    public Color getColor() {
        return color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    
//Metodo que convierte a String los atributos.    
    public String toString() {
        return color + ": " + posicion;
    }

    
//Si es posible actualiza la posición de un objeto en base a las direcciones del enumerdao "Dirección".
//En caso contrario sigue los parámetros fijados por la clase "Posición".
    public void Mueve(Direccion direccion) {

        int fila = posicion.getFila();
        int numero_columna = posicion.getColumna();
        
        switch (direccion) {
            case NORTE:
                if(Ilegal(Direccion.NORTE)){
                    Ilegal(Direccion.NORTE);
                }
                else{
                    posicion.setFila(fila + 1);
                }                            
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

//Informa cuando la posición está fuera del marco bidimensional fijado.   
    private boolean Ilegal(Direccion direccion) {
        
        int fila = posicion.getFila();
        int columna = posicion.getColumna();
        boolean ilegal = true;
        switch (direccion) {
            case NORTE:
                if (fila + 1 < 1 || fila + 1 > 8) {
                    System.out.print("Movimiento ilegal.");
                    ilegal = false;
                }              
                break;
            case SUR:
                if (fila - 1 < 1 || fila - 1 > 8) {
                    System.out.print("Movimiento ilegal.");
                    ilegal = false;
                }
                break;
            case ESTE:
                if (columna + 1 < 'a' || columna + 1 > 'h') {
                    System.out.print("Movimiento ilegal.");
                    ilegal = false;
                }
                break;
            case OESTE:
                if (columna - 1 < 'a' || columna - 1 > 'h') {
                    System.out.print("Movimiento ilegal.");
                    ilegal = false;
                }
                break;
            case NORESTE:
                if (fila + 1 < 1 || fila + 1 > 8) {
                    System.out.print("Movimiento ilegal.");
                    ilegal = false;
                }
                if (columna + 1 < 'a' || columna + 1 > 'h') {
                    System.out.print("Movimiento ilegal.");
                    ilegal = false;
                }
                break;
            case SURESTE:
                if (fila - 1 < 1 || fila - 1 > 8) {
                    System.out.print("Movimiento ilegal por ");
                    ilegal = false;
                }
                if (columna + 1 < 'a' || columna + 1 > 'h') {
                    System.out.print("Movimiento ilegal por ");
                    ilegal = false;
                }
                break;
            case NOROESTE:
                if (fila + 1 < 1 || fila + 1 > 8) {
                    System.out.print("Movimiento ilegal por ");
                    ilegal = false;
                }
                if (columna - 1 < 'a' || columna - 1 > 'h') {
                    System.out.print("Movimiento ilegal por ");
                    ilegal = false;
                }
                break;
            case SUROESTE:
                if (fila - 1 < 1 || fila - 1 > 8) {
                    System.out.print("Movimiento ilegal por ");
                    ilegal = false;
                }
                if (columna - 1 < 'a' || columna - 1 > 'h') {
                    System.out.print("Movimiento ilegal por ");
                    ilegal = false;
                }
                break;
        }
        return ilegal;
    }

}
