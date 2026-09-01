package exercicios;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RespostaLegal{
    public static void main (String[] args){
        // aqui so pra deixar as criações do PAI kkkkkkkk
        Scanner legal = new Scanner (System.in);
        double valores, soma, maiorValor, menorValor, indiceMaior, indiceMenor;

        System.out.println("Digite 5 valores");

        Double[] numeros = new Double[5];

        for (int i=0; i<=4; i++){
            numeros[i] = legal.nextDouble();
        }

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println("maior numero: "+numeros[0]+"\n"+
                            "menor numero: "+numeros[4]);

        /*
        3. Crie variaveis para:
                - `soma`.
                - `maiorValor`.
                - `menorValor`.
                - `indiceMaior` e `indiceMenor`.
        */
       
        for (int i =0; i <= numeros.length - 1; i++){
            soma = numeros[i] + numeros[i+1];
        }
    }
}