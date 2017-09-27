/*
Ejercicio 11: Construir un programa que simule el funcionamiento de una 
calculadora, que pueda realizar las 4 operaciones aritmeticas básicas 
(suma, resta, producto y división) con valores numericos enteros. El usuario 
debe especificar la operacion con el primer carácter del primer parámetro de la 
linea de comandos: S o s oara la suma, R o r para la resta, P, p, M o m para el 
producto y D o d para la división.
*/
package pats.pkg25.pkg11.calculadorabasica;

import javax.swing.JOptionPane;

public class PATS2511CalculadoraBasica {

    public static void main(String[] args) {
        
        int num1, num2,sum, res, mul, div;
        char operacion;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un NUMERO"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un OTRO NUMERO"));
        operacion  = JOptionPane.showInputDialog("¿Que OPERACION quieres hacer?").charAt(0);
        
        switch(operacion){
            case 's': case 'S':
                sum = num1 + num2;
                JOptionPane.showMessageDialog(null, "La SUMA es: " + sum);
                break;
            case 'r':
            case 'R':
                res = num1 - num2;
                JOptionPane.showMessageDialog(null, "La RESTA es: " + res);
                break;
            case 'm':
            case 'M':
            case 'p':
            case 'P':
                mul = num1 * num2;
                JOptionPane.showMessageDialog(null, "La MULTIPLICACION es: " + mul);
                break;
            case 'd': case 'D':
                div = num1 / num2;
                JOptionPane.showMessageDialog(null, "La DIVICION es: " + div);
                break;
            
              
        }
        
    }
    
}
