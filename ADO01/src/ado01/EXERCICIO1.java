/*1. Criar um programa que receba o valor do salário de um funcionário e o valor do salário mínimo e apresente na tela quantos
salários mínimos ganha esse funcionário.

@By Alison Avelino
*/

package ado01;
import java.util.Scanner;

public class EXERCICIO1 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float salario, salarioMinimo, resultado;
        
        System.out.print("Qual é o valor salário do funcionario R$ ");
        salario = leitor.nextInt();
        System.out.print("Informe qual é o valor do salário mínimo R$ ");
        salarioMinimo = leitor.nextInt();
  
         resultado = salario / salarioMinimo;
        System.out.print("O funcionario recebe " + String.format("%.2f", resultado) + " salário(s) mínimo(s) !");
    }
    
}