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
    
    public String toString(){
        return color + ": " + posicion;
    }
}
