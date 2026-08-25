package com.example;

public class AnaliseComplexidade {

    private static final int N = 10;
//get and set
    public static int getN()
    {
        return N;
    }
    /* 
    public void setN(int N) 
    {
        this.N = N;
    }nao precisa disso aqui nao, pq o 10 ali ja é o "set"
    */

    public void tempoConstante (int[] numeros)
    {
        System.out.println("Primeiro numero do vetor"+ numeros[0]);
    }

    public void tempoLogaritmico(int n)
    {
        int passos = 0;

        int valor = n;

        while (valor > 1)
        {
            valor = valor / 2;
            passos++;

            System.err.println("passo: "+passos+" -> valor reduzido para: "+valor);
        }
    }
    
    public void tempoLinear(int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.println("contando" + i);
        }
    }
    public void tempoQuadratico(int n)
    {
        for(int i = 0; i < n; i++)
        {
             
        for (int j = 0; j < n; j++)
        {
            System.out.println("=======");
            System.out.println("Contando "+j);
            System.out.println("Par: ("+ i +""+ j + ")");
            System.out.println("=======");
        }}    
            
    }

    
}
