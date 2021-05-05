/*5. (1,0) Criar um programa que leia a idade de um nadador e apresente a sua categoria de acordo com a tabela abaixo:
Idade Categoria
5 a 7 anos Infantil A
8 a 10 anos Infantil B
11-13 anos Juvenil A
14-17 anos Juvenil B
Maiores de 18 anos (inclusive) Adulto

@By Alison Avelino
 */
package aav01;
import java.util.Scanner;

public class EX05 {
    public static void main(String[] args){
        int idade;
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Validação de categoria de nadador" + "\n");
        
        System.out.print("Informe a idade do nadador: ");
        idade = leitor.nextInt();
        
        if(idade >= 5 && idade <= 7){
            System.out.print("O nadador tem " + idade + " anos e sua categoria é Infantil A. ");
        }else if(idade >= 8 && idade <= 10){
            System.out.print("O nadador tem " + idade + " anos e sua categoria é Infantil B. ");
        }else if(idade >= 11 && idade <= 13){
            System.out.print("O nadador tem " + idade + " anos e sua categoria é Juvenil A. ");
        }
        else if(idade >= 14 && idade <= 17){
            System.out.print("O nadador tem " + idade + " anos e sua categoria é Juvenil B.");
        }else if(idade >= 18){
            System.out.print("O nadador tem " + idade + " anos e sua categoria é Adulto. ");
        }
        else{System.out.print("O nadador tem " + idade + "anos e não há categoria definida. ");}
        
        
        
    }
    
}
