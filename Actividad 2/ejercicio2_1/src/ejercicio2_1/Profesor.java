/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2_1;

/**
 *
 * @author matim
 */
public class Profesor extends Persona{
    private int numEmpleado;
    
    public Profesor(int n){
        this.numEmpleado = n;
    }

    @Override
    public String toString() {
        return "Un profesor de edad " + edad + ", con clave " + numEmpleado;
    }
    
}
