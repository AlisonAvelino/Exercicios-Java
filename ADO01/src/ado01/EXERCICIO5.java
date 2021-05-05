/*5. Criar um programa que leia o salário de um funcionário (salário bruto), calcule e apresente na tela:
• Desconto de 8% de INSS
• Desconto de 15% de IR
• Bônus de 5,75% sobre o salário líquido
• Salário Bruto e Líquido

@By Alison Avelino
*/

package ado01;
import java.util.Scanner;

public class EXERCICIO5 {
    public static void main(String[] args) {
        float salarioBruto, descInss, descIr, salarioLiq, bonusLiq, salarioBonus;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Descostos e Bônus "+"\n");
        System.out.print("Informe o salário do funcionario R$ ");
        salarioBruto = leitor.nextInt();
        
        descInss = (salarioBruto / 100) * 8;
        descIr = (salarioBruto / 100) * 15;
        salarioLiq = (salarioBruto - descInss) - descIr;
        bonusLiq = (salarioLiq / 100) * 5.75f;
        salarioBonus = salarioLiq + bonusLiq;
        
        
        System.out.print("O valor do desconto do INSS é de R$:  " + String.format("%.2f", descInss)+"\n");
        
        System.out.print("O valor do desconto do IR é de R$:  " + String.format("%.2f", descIr)+"\n");
        System.out.print("O bônus sobre o salário líquido R$:  " + String.format("%.2f", bonusLiq)+"\n");
        System.out.print("O Salário Bruto é de R$:  " + String.format("%.2f", salarioBruto)+"\n");
        System.out.print("O Salário Líquido é de R$:  " + String.format("%.2f", salarioBonus)+"\n");
        
    }
    
}