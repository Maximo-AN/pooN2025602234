/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_2;

/**
 *
 * @author matim
 */
public class TrianguloRect extends FiguraRecta {
    public TrianguloRect(int an, int al){
        this.alto = al;
        this.ancho = an;
    }
    
    @Override
    public String imprimeFigura(){
        return super.imprimeFigura() + "\n" + String.format("Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f \n",
                alto,ancho,calcularArea(),calcularPerimetro());
    }

    @Override
    public double calcularArea() {
        return (alto * ancho) / 2.0;
    }

    @Override
    public double calcularPerimetro() {
        double h = Math.sqrt((Math.pow(alto, 2) + Math.pow(ancho, 2)));
        return alto + ancho + h;
    }
    
}
