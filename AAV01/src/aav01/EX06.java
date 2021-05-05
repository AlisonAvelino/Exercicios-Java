/*(2,0) Criar um programa que leia 3 números reais A, B e C e ordene-os em ordem decrescente, de modo que o lado
A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base
nos seguintes casos, sempre escrevendo uma mensagem adequada:

@By Alison Avelino*/

package aav01;
import java.util.Scanner;

public class EX06 {
    public static void main(String[] args){
        float num1, num2, num3, A, B, C;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Verificação de triângulos"+"\n");
        
        System.out.print("Informe o primeiro número: ");
        num1 = leitor.nextInt();
        
        System.out.print("Informe o segundo número: ");
        num2 = leitor.nextInt();
        
        System.out.print("Informe o terceiro número: ");
        num3 = leitor.nextInt();
        
        if( ( num1 > num2 && num1 > num3 ) && ( num2 > num3 ) ) { 
            A = num1;
            B = num2;
            C = num3;
        }else if( ( num1 > num2 && num1 > num3 ) && ( num3 > num2) ) { 
            A = num1;
            B = num3;
            C = num2;
        }else if( ( num2 > num1 && num2 > num3 ) && ( num1 > num3 ) ) { 
            A = num2;
            B = num1;
            C = num3;
        }else if( ( num2 > num1 && num2 > num3 ) && ( num3 > num1 ) ) { 
            A = num2;
            B = num3;
            C = num1;
        }else if( ( num3 > num1 && num3 > num2 ) && ( num1 > num2 ) ) { 
            A = num3;
            B = num1;
            C = num2;           
        }else { 
            A = num3;
            B = num2;
            C = num1;
        }
        
        if(A >= B+C ){
            System.out.print("Não forma triângulo. ");
        }else if(A*A == B*B + C*C){
            System.out.print("Triangulo retângulo. ");
        }else if(A*A > B*B + C*C){
            System.out.print("Triangulo obsutangulo. ");
        }else if(A*A < B*B + C*C){
            System.out.print("Triangulo acutangulo. ");
        }else if((A == B && A == C) && (B == C)){
            System.out.print("Triangulo equilatero");
        }            
    }
}

