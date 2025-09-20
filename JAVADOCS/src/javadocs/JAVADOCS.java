/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadocs;

/**
 * 
 * Este es un ejemplo de como podriamos
 * generar un documento tecnico en la que 
 * explique nuestro codigo.
 * 
 * @author Creador: Oscar Andrade
 * @since Creado: 19 de september del 2025
 * @version 0.0
 * 
 * @author Actualizado: Marlon Martinez
 * @since Actualizado 20/sept/26
 * @version 0.1
*/

public class JAVADOCS {



    /**
     * Es un metodo la cual esta desarrollado para
     * mostrar un mensaje personalizado de bienvenida
    */
    public void mostrarBienvenida() {
        System.out.println("Bienvenido a la Calculadora Utils!");
    }
    /**
     * Funcion de Suma, que necesita dos parametros para 
     * poder realizar la suma correspondiente y devolver el valor.
     * 
     * @param a Variable del tipo Entero
     * @param b 2da Variable del tipo Entero
     * @return resultadoTemporal Variable que almacena la suma de los enteros.
    */
    public int sumar(int a, int b) {
        int resultadoTemporal;
        
        resultadoTemporal = a + b;
   
        return resultadoTemporal;
    }

     /**
     * Funcion que permite dividir dos numeros entre si, siempre que
     * el denominador o divisor no sea Cero.
     * 
     * @param numerador Variable del tipo Entero.
     * @param denominador Variable del tipo Entero.
     * @return resultado Es la division entre numerador y el denominador.
     * 
     * @throws ArithmeticException se tiene una bandera de excepcion 
     *  de error arimetico al cuando el denominador es cero.
     * 
     * 
    */
    public double dividir(int numerador, int denominador) throws ArithmeticException {
        double resultado = 0;
        if (denominador == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        resultado = numerador / denominador;
        return resultado ;
    }

    public void mostrarTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }


    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        }
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }


    public static void main(String[] args) {
        JAVADOCS calc = new JAVADOCS();

        calc.mostrarBienvenida();

        System.out.println("Suma: " + calc.sumar(5, 7));
        System.out.println("División: " + calc.dividir(10, 2));

        calc.mostrarTablaMultiplicar(4);

        System.out.println("Factorial de 5: " + calc.factorial(5));
    }
}