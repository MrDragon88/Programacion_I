/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1poo;

/**
 *
 * @author Oscar Andrade
 */
public class Calculadora {
    
    //Atributos
    private double num1;
    private double num2;
    private double resultado;
    
    //Constructor
    public Calculadora(){
          this.num1 = 0;
          this.num2 = 0;
          this.resultado =0;
    }//Fin Constructor Sin Parametros
    
    public Calculadora(double n1, double n2){
        this.num1 = n1;
        this.num2 = n2;
    }//Fin Constructor con Parametros
    
    public double CalcularSuma(double n1, double n2){
        
        this.resultado = n1 + n2;
        
        return this.resultado;
    }//Fin Metodo CalcularSuma
    
    public double CalcularSuma(){
        this.resultado = this.num1 + this.num2;
        return this.resultado;
    }//Fin Metodo CalcularSuma
    
    public void setNum1(double n1){
        this.num1 = n1;
    }
    
    public void setNum2(double n2){
        this.num2 = n2;
    }
    
    public double CalcularPotencia(double n1, int exponente){
        this.resultado = Math.pow(n1, exponente);
        
        return this.resultado;
    }
    
}//Fin  Class
