/* 6. As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12. Criar
um programa que leia o número de maçãs compradas, calcule e apresente na tela o custo total da compra.

@By Alison Avelino
 */
package ado01;
import java.util.Scanner;

public class EXERCICIO6 {
        public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int quantidadeDeMacas;
        float valorTotal;
        System.out.print("Compras" + "\n");
        System.out.print("Digite a quantidade de maçãs desejadas: ");
        quantidadeDeMacas = leitor.nextInt();
        
        
        if (quantidadeDeMacas < 12) {
            valorTotal = quantidadeDeMacas * 1.30f;
        }else {
            valorTotal = quantidadeDeMacas * 1.0f;
        } 
        
        System.out.println("O custo total da compra é R$" + String.format("%.2f", valorTotal)+"!");
        }
}
