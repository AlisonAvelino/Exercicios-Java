/*9. Criar um programa que leia o peso e a altura de uma pessoa, calcule o seu IMC (Índice de Massa Corporal), e apresente na
tela uma mensagem informando se a pessoa está ou não no seu peso ideal, de acordo com a tabela abaixo. A fórmula para
calcular o IMC é: IMC = peso / altura2

@By Alison Avelino*/

package ado01;
import java.util.Scanner;

public class EXERCICIO9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float peso, altura, imc;
	
	System.out.print("Cálculo de IMC" + "\n");

        System.out.print("Informe o peso em quilos(ex: 45,5):");
        peso = leitor.nextFloat();

        System.out.print("Informe a altura peso em metros(ex: 1,7):");
        altura = leitor.nextFloat();

	imc = peso / (altura * altura);

	if(imc < 20){
            System.out.print("O indíce de massa corporal é " + String.format("%.2f", imc) + 
                " está abaixo do ideal que é entre 20 e 25.");
	}else if(imc <= 25){
            System.out.print("O indíce de massa corporal é " + String.format("%.2f", imc) +
                " está ideal.");
	}else{ System.out.print("O indíce de massa corporal é " + String.format("%.2f", imc) +
                " está acima do peso ideal que é entre 20 e 25.");
	}

        
    }
}
    
