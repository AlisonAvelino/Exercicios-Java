
/*7. Criar um programa que leia dois números inteiros e apresente uma mensagem 
indicando se o primeiro número é múltiplo do segundo.

@By Alison Avelino*/

package ado01;
import java.util.Scanner;

public class EXERCICIO7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1, num2,resu;
	
	System.out.print("Verificação de Múltiplos" + "\n");

        System.out.print("Informe o primeiro número:");
        num1 = leitor.nextInt();

        System.out.print("Informe o segundo número:");
        num2 = leitor.nextInt();
	
	System.out.print("Iremos fazer a validação agora!" + "\n");
	
	resu = num1 % num2;

	if(resu == 0){
            System.out.print("Sim! O primeiro número " + num1 + " é um múltiplo do segundo " + num2 + ".");
	}else{
            System.out.print("Não! O primeiro número " + num1 + " não é um múltiplo do segundo " + num2 + ".");
	}

        
    }
}
    
