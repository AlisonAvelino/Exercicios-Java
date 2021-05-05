/*
4. O custo ao consumidor, de um carro novo, é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos
(aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, criar um
programa que leia o custo de fábrica de um carro e apresenta na tela o custo final ao consumidor.
 
@author Alison Avelino
*/
package ado01;
import java.util.Scanner;

public class EXERCICIO4 {
    public static void main(String[] args) {
        float custoDeFabrica, porcentDist, impost, custoFinal;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Informe qual é o custo de fábrica do veículo em R$:");
        custoDeFabrica = leitor.nextInt();
        
        porcentDist = (custoDeFabrica / 100) * 28;
        impost = (custoDeFabrica / 100) * 45;
        custoFinal = custoDeFabrica + porcentDist + impost;
        
        System.out.print("O custo final do veiculo é R$ " + String.format("%.2f", custoFinal)+ "!");
       
    }
    
}

