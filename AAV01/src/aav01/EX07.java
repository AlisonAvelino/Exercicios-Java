/* 7. (1.0)Leia 3 números decimais A, B e C e efetue o cálculo das raízes da equação de Bhaskara.
Se não for possível calcular as raízes, ou seja, caso haja uma divisão por 0 ou raiz de numero negativo,mostre
a mensagem correspondente “Impossivel calcular ”.
 
@By Alison Avelino*/

package aav01;
import java.util.Scanner;



public class EX07 {
    
    Scanner leitor = new Scanner(System.in);
    int A, B, C;
    double delta, x1, x2;
    
    public EX07() {
        calculaDelta();
    }
 
    private void calculaDelta(){  
        
        System.out.println("Fórmula de Bhaskara" + "\n");
        System.out.println("Informe o valor de A: ");
        A = leitor.nextInt();
        
        System.out.println("Informe o valor de B: ");
        B = leitor.nextInt();
        
        System.out.println("Informe o valor de C: ");
        C = leitor.nextInt();
         
        delta = (B * B) + (-4 * (A * C));
 
        System.out.println("Delta: " + delta);
 
        if (delta >= 0) {
            calculaX();
        }else {
            System.out.println("Impossivel calcular!");           
        }
 
    }
 
    private void calculaX() {
 
        x1 = (double) ((-(B) + Math.sqrt(delta)) / 2 * A);
        x2 = (double) ((-(B) - Math.sqrt(delta)) / 2 * A);
 
        System.out.println("O resultado de x1 é " + x1);
        System.out.println("O resultado de x2 é " + x2);
 
    }
    
    public static void main(String[] args) {
        new EX07();
    }
}
    

