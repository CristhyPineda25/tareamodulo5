/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pined
 */
public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("morado", 30);
        circulo.dibujar();
        System.out.println("Radio del circulo: " + circulo.calcularR());
         System.out.println("Color del circulo: " + circulo.color());
         
        Linea linea = new Linea("amarillo", 50);
        linea.dibujar();
        System.out.println("Color de la linea: " + linea.color());
        
        Triangulo triangulo = new Triangulo("verde", 15);
        triangulo.dibujar();
        System.out.println("Area del triangulo: " + triangulo.calcularA());
        System.out.println("Color del triangulo: " + triangulo.color());

        Cuadrado cuadrado = new Cuadrado("anaranjado", 25);
        cuadrado.dibujar();
        System.out.println("Area del cuadrado: " + cuadrado.calcularA());
         System.out.println("Color del cuadrado: " + cuadrado.color());
    }
}

