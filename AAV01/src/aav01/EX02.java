/*2. (1,0) Criar um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele
no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, calcular e
imprimir o total a receber no final do mês.

@By Alison Avelino
*/

package aav01;
import java.util.Scanner;

public class EX02 {
    public static void main(String[] args) {
        float salario, vendas, comissao, salarioLiq;
        String funcionario;
        
        Scanner leitor = new Scanner(System.in);
      
        System.out.print("Comissão de vendas"+"\n");
        
        System.out.print("Informe o primeiro nome do funcionário: ");
        funcionario = leitor.next();
        
        System.out.print("Informe o salário fixo: ");
        salario = leitor.nextFloat();
        
        System.out.print("Informe o valor de vendas efetuadas(em dinheiro): ");
        vendas = leitor.nextFloat();
        
        comissao = (vendas / 100) * 15;
        salarioLiq = salario + comissao;
        
        System.out.print(funcionario + " o seu salário é R$ " + String.format("%.2f", salarioLiq)+ ".");
        
    }
    
}
