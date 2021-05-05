/* 8. (1.0) Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. Veja abaixo
alguns exemplos. Não fixe esses valores no código. Você pode usá-los para TESTAR seu algoritmo:
 

@By Alison Avelino*/

package aav01;
import java.util.Scanner;

public class EX08 {
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
