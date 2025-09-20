/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadocs;

/**
 *
 * @author Oscar Andrade
 */
public class JAVADOCS {



    public void mostrarBienvenida() {
        System.out.println("Bienvenido a la Calculadora Utils!");
    }


    public int sumar(int a, int b) {
        return a + b;
    }


    public double dividir(int numerador, int denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        return (double) numerador / denominador;
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