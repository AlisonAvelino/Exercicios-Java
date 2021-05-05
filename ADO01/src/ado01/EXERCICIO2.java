/* 2. Criar um programa que leia a idade de uma pessoa expressa em anos, mês e dias e apresente na tela a idade dessa pessoa
expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

@By Alison Avelino
*/
package ado01;
import java.util.Scanner;


public class EXERCICIO2{
    public static void main(String[] args) {
        int diaNasc, mesNasc, anoNasc, diaAtl, mesAtl, anoAtl, diaCalc, 
            mesCalc, anoCalc, idadeEmDias;
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o dia, mês e ano do seu nascimento para saber sua idade em dias" + "\n");
        
        System.out.print("Dia do nascimento(de 0 a 31 ex: 16): ");
        diaNasc = leitor.nextInt();
        System.out.print("Mês do nasciment(0 a 12, ex: 6): ");
        mesNasc = leitor.nextInt();
        System.out.print("Ano do nascimento(ex: 2000): ");
        anoNasc = leitor.nextInt();  
        
        System.out.println("Insira a data atual.");      
        System.out.print("Dia (de 0 a 31 ex: 16): ");
        diaAtl = leitor.nextInt(); 
        if (diaAtl < diaNasc ){
            diaCalc = diaAtl;
        }else {
            diaCalc = diaAtl - diaNasc;
            }
        
        System.out.print("Mês (0 a 12, ex: 6): ");
        mesAtl = leitor.nextInt();
        if (mesAtl < mesNasc ){
                mesCalc = mesAtl + mesNasc;
        }else if(mesAtl > mesNasc){
            mesCalc = mesAtl - mesNasc;
        }else{mesCalc = 0;}
        
        System.out.print("Ano (ex: 2000): ");
        anoAtl = leitor.nextInt();       
        if (anoAtl > anoNasc ){
                anoCalc = (anoAtl - anoNasc);
        }else{
            anoCalc = 0;
            System.out.print("Atenção a data informada foi inserida incorretamente!");
        }
 
        idadeEmDias = (diaCalc + mesCalc * 30 + anoCalc * 365);
        System.out.print("A data do seu nascimento é " + diaNasc + "/" + mesNasc + "/" + anoNasc + "\n");
        System.out.print("A Sua idade em dias é de " + idadeEmDias + " dias.");

    }
}