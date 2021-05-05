/*8. Criar um programa que leia a hora de início e a hora de fim de um jogo de xadrez (considere apenas horas inteiras, sem os
minutos), calcule e apresente na tela a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

@By Alison Avelino*/

package ado01;
import java.util.Scanner;

public class EXERCICIO8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int diaInicio, horaInicio, diaTermino, horaTermino, horaDuracao;
	
	System.out.print("Duração da Partida" + "\n");

        System.out.print("Informe o dia de início da partida (Apenas o dia ex: 15):");
        diaInicio = leitor.nextInt();

        System.out.print("Informe qual é o horário de início da partida (no formato de 0 a 24):");
        horaInicio = leitor.nextInt();

	System.out.print("Informe o dia do término da partida (Apenas o dia ex: 15):");
        diaTermino = leitor.nextInt();

        System.out.print("Informe qual foi o horário de término da partida (no formato de 0 a 24):");
        horaTermino = leitor.nextInt();

	if(diaInicio == diaTermino){
            horaDuracao = horaTermino - horaInicio;
	}else{
            horaDuracao = 24 - horaInicio + horaTermino;
	}

	System.out.print("A duração totalda partida foi de " + horaDuracao + " horas!");

        
    }
}