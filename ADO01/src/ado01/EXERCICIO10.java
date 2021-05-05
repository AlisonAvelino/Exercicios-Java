/*10. Criar um programa que leia o valor de três notas escolares de um aluno. Calcular a média aritmética e apresentar na tela a
mensagem “Aprovado” se a média obtida for maior ou igual a 7; caso contrário, o programa deve solicitar a nota de exame
do aluno e calcular uma nova média aritmética entre a nota do exame e a primeira média aritmética. Se o valor da nova
média for maior ou igual a 5, apresentar na tela a mensagem “Aprovado em exame”; caso contrário, apresentar a mensagem
“Reprovado”. Informar junto com cada mensagem o valor da média obtida.

@By Alison Avelino*/

package ado01;
import java.util.Scanner;


public class EXERCICIO10{
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float nota, nota2, nota3, media, notaExame, mediaExame;
	
	System.out.print("Cálculo de Média" + "\n");

        System.out.print("Informe a primeira nota:");
        nota = leitor.nextFloat();

      	System.out.print("Informe a segunda nota:");
        nota2 = leitor.nextFloat();

	System.out.print("Informe a terceira nota:");
        nota3 = leitor.nextFloat();

	media = (nota + nota2 + nota3) / 3;

	if(media >= 7){
	System.out.print("A média é " + String.format("%.2f", media) + 
        ". Você está aprovado!");
	}else{
	System.out.print("Informe a nota do exame:");
	notaExame = leitor.nextFloat();
        mediaExame = (media + notaExame) / 2;
	        
            if(mediaExame > 5){
            System.out.print("A média é " + String.format("%.2f", mediaExame) + 
                    ". Você foi aprovado pelo exame!");
            }else{ System.out.print("Você foi reprovado. A média das notas foi " 
                    + String.format("%.2f", media) + " e a média do exame foi " + mediaExame);
            }
        }

        
    }
}