/*1. (2.0)Crie um programa que simule uma calculadora simples capaz de realizar as operações básicas. O programa
deve receber 3 dados: dois números e um caractere. Este caractere poderá ser '+', '-', ‘*' ou '/' , e representarão a
operação matemática que você deseja realizar entre os números.

@ By Alison Avelino*/

package aav01;
import java.util.Scanner;

public class EX01{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        float num1, num2, resultado;
        String caractere;
        
        System.out.print("CALCULADORA BÁSICA" + "\n");
        
        System.out.print("Informe o primeiro número:");
        num1 = leitor.nextFloat();
        
        System.out.print("Informe qual operador básico você deseja usar(EX: +, - , *, /):");
        caractere = leitor.next();
        
        System.out.print("Informe o segundo número:");
        num2 = leitor.nextFloat();
        
        switch (caractere) {

        case "+":
            resultado = num1 + num2;
            System.out.print("O resultado da soma é " + String.format("%.2f", resultado) + ".");
            break;

        case "-":
            resultado = num1 - num2;
            System.out.print("O resultado da subtração é " + String.format("%.2f", resultado) + ".");
            break;
    

        case "*":
            resultado = num1 * num2;
            System.out.print("O resultado da múltiplicação é " + String.format("%.2f", resultado) + ".");
            break;

        case "/":
            resultado = num1 / num2;
            System.out.print("O resultado da divisão é " + String.format("%.2f", resultado) + ".");
            break;
        }
        
        
        
     
                  
    
    }


}


