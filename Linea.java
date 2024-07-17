/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pined
 */
public class Linea extends Formas {
    private double largo;
    private String color;
    
    public Linea(String color, double largo) {
        super(color);
        this.largo = largo;
        this.color = color;
    }
     public String color() {
        return this.color;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujar Linea");
    }
}
