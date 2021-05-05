/*3. (1,0) Criar um programa que leia três números inteiros e apresente na tela o maior deles.

@By Alison Avelino*/
package aav01;
import java.util.Scanner;

public class EX03 {
    public static void main(String[] args){
        int num1, num2, num3;
        Scanner leitor = new Scanner(System.in);
      
        System.out.print("Validação de números inteiros"+"\n");
        
        System.out.print("Informe o primeiro número: ");
        num1 = leitor.nextInt();
        
        System.out.print("Informe o segundo número: ");
        num2 = leitor.nextInt();
        
        System.out.print("Informe o terceiro número: ");
        num3 = leitor.nextInt();
        
        if(num1 > num2 && num1 > num3){
            System.out.print("O maior número é o " + num1 + ".");
        }else if(num2 > num1 && num2 > num3){
            System.out.print("O maior número é o " + num2 + ".");
        }else if(num3 > num1 && num3 > num2){
            System.out.print("O maior número é o " + num3 + ".");
        }else{
            System.out.print("Os números são iguais.");
        }
    }
             
}

