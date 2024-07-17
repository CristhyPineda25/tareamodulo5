/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pined
 */
public class Circulo extends Formas {
    private double radio;
    private String color;
    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
        this.color = color;
    }

    public double calcularR() {
        return this.radio;
    }
        public String color() {
        return this.color;
    }
  
    @Override
    public void dibujar() {
        System.out.println("Dibujar Circulo");
    }
}
