/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2_2;

/**
 *
 * @author matim
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura2D f = new TrianguloRect(3,4);
        System.out.println(f.imprimeFigura());
        f = new Circulo(3);
        System.out.println(f.imprimeFigura());
    }
    
}
