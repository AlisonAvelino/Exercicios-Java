/*4. (1,0) Criar um programa que leia dois números L e R. O programa deve verificar a maior área entre um quadrado
de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Circulo".

@By Alison Avelino*/

package aav01;
import java.util.Scanner;

public class EX04 {
    

    public static void main(String[] args){
        float lado, raio;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Validação de área" + "\n");
        
        System.out.print("Digite L:");
        lado = leitor.nextInt();
        
        System.out.print("Digite R:");
        raio = leitor.nextInt();
        
        float Quadrado = lado*lado;
        float Circulo = 3.14f*raio;
        
        
        if (Quadrado == Circulo){
            System.out.print("Ambos têm a mesma área.");
        }else if (Quadrado > Circulo){
            System.out.print("O quadrado é maior " + Quadrado);
        }else{
            System.out.print("O circulo é maior " + Circulo);
        }
    
    }
}

