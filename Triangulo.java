/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pined
 */
public class Triangulo extends Formas {
    private double angulo;
    private String color;
    
    public Triangulo(String color, double angulo) {
        super(color);
        this.angulo = angulo;
        this.color = color;
    }

    public double calcularA() {
        // Ejemplo de cálculo de área, asumiendo dimensiones específicas
        double base = 5;
        double altura = 10;
        return 0.5 * base * altura;
    }
     public String color() {
        return this.color;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujar Triangulo");
    }
}

