/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pined
 */
public class Cuadrado extends Formas {
    private double area;
    private String color;
    public Cuadrado(String color, double area) {
        super(color);
        this.area = area;
        this.color = color;
    }

    public double calcularA() {
        return this.area;
    }
     public String color() {
        return this.color;
    }


    @Override
    public void dibujar() {
        System.out.println("Dibujar Cuadrado");
    }
    
   
}

