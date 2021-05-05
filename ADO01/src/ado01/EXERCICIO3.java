/*3. Criar um programa que calcule e apresente na tela o volume de uma esfera de raio R, em que R é um dado fornecido pelo
usuário. O volume de uma esfera é dado por V = 4/3πR3.

@By Alison Avelino
*/

package ado01;
import java.util.Scanner;

public class EXERCICIO3 {
    public static void main(String[] args) {
        
        double raio, pi, volume, elemento;
        
        Scanner leitor = new Scanner(System.in);
        System.out.print("Calcula volume de esfera" + "\n");
        System.out.print("Digite o raio da esfera: ");
        raio = leitor.nextDouble();
        
        pi = 3.14;
        elemento = Math.pow(raio, 3);
        volume = 4 * pi * elemento / 3;
        
        System.out.print("O volume da esfera é de " + String.format("%.2f", volume)+ "!");


    }
}
   