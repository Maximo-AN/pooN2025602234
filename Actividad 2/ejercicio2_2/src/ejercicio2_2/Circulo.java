/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_2;

/**
 *
 * @author matim
 */
public class Circulo extends FiguraCircular {
    public Circulo(int r){
        this.radio = r;
    }
    
    @Override
    public String imprimeFigura(){
        return super.imprimeFigura() + "\n" + String.format("Se imprime un Circulo con radio: %d, area: %.2f, perimetro: %.2f\n",
                radio,calcularArea(),calcularPerimetro());
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2.0);
    }

    @Override
    public double calcularPerimetro() {
        return 2.0 * Math.PI * radio;
    }
}
