/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author Hugo
 */
public class Calculadora {

    public static void main(String[] args) {
        //Instanciando a classe soma
        Soma som = new Soma(); 
        
        //Cenário de teste 1: Soma de dois valores positivos
        var soma = som.somar(3,7);
        System.out.println(soma);
        
        //Cenário de teste 2: Soma de dois valores sendo um zero
        soma = som.somar(3,0);
        System.out.println(soma);
        
        //Cenário de teste 3: Soma  de dois valores sendo que ambos são zero
        soma = som.somar(0,0);
        System.out.println(soma);
        
        //Cenário de teste 4: Soma de dois valores sendo um negativo
        soma = som.somar(3,-1);
        System.out.println(soma);
        
        //Cenário de teste 5: Soma de dois valores sendo os dois negativos
        soma = som.somar(-3,-2);
        System.out.println(soma);
        
        //Cenário de teste 6: Soma de dois valores sendo um zero e outro negativo
        soma = som.somar(0, -3);
        System.out.println(soma);
        
        //Instanciando a classe subtracao
        Subtracao sub = new Subtracao();
        
        //Cenário de teste 1: Subtração de dois valores positivos
        int subtracao = sub.subtrair(7,3);
        System.out.println(subtracao);
        
        //Cenário de teste 2: Subtração de dois valores sendo um zero
        subtracao = sub.subtrair(3,0);
        System.out.println(subtracao);
        
        //Cenário de teste 3: Subtração  de dois valores sendo que ambos são zero
        subtracao = sub.subtrair(0,0);
        System.out.println(subtracao);
        
        //Cenário de teste 4: Subtração de dois valores sendo um negativo
        subtracao = sub.subtrair(3,-1);
        System.out.println(subtracao);
        
        //Cenário de teste 5: Subtração de dois valores sendo os dois negativos
        subtracao = sub.subtrair(-3,-2);
        System.out.println(subtracao);
        
        //Cenário de teste 6: Subtração de dois valores sendo um zero e outro negativo
        subtracao = sub.subtrair(-3, 0);
        System.out.println(subtracao);
        
        //Instanciando a classe divisao
        Divisao div = new Divisao();
        
        //Cenário de teste 1: Divisão de dois valores positivos sendo o primeiro um numero maior
        int divisao = div.dividir(10,5);
        System.out.println(divisao);
        
        //Cenário de teste 2: Divisão de dois valores positivos sendo o segundo um numero maior
        divisao = div.dividir(3,6);
        System.out.println(divisao);
        
        //Cenário de teste 3: Divisão de dois valores negativos sendo o primeiro um numero maior
        divisao = div.dividir(-3,-9);
        System.out.println(divisao);
        
        //Cenário de teste 4: Divisão de dois valores negativos sendo o segundo um numero maior
        divisao = div.dividir(-8,-2);
        System.out.println(divisao);
        
        //Cenário de teste 5: Divisão de dois valores sendo o segundo negativo
        divisao = div.dividir(6,-2);
        System.out.println(divisao);
        
        //Cenário de teste 6: Divisão de dois valores sendo o primeiro um zero
        divisao = div.dividir(0, 3);
        System.out.println(divisao);
        
        //Instanciando a classe multiplicacao
        Multiplicacao mult = new Multiplicacao();
        
        //Cenário de teste 1: Multiplicação de dois valores positivos
        int multiplicar = mult.multiplicar(3,7);
        System.out.println(multiplicar);
        
        //Cenário de teste 2: Multiplicação de numero positivo e um zero
        multiplicar = mult.multiplicar(3,0);
        System.out.println(multiplicar);
        
        //Cenário de teste 3: Multiplicação  de dois valores sendo que ambos são zero
        multiplicar = mult.multiplicar(0,0);
        System.out.println(multiplicar);
        
        //Cenário de teste 4: Multiplicação de dois valores sendo um positivo e um negativo
        multiplicar = mult.multiplicar(3,-1);
        System.out.println(multiplicar);
        
        //Cenário de teste 5: Multiplicação de dois valores sendo os dois negativos
        multiplicar = mult.multiplicar(-3,-2);
        System.out.println(multiplicar);
        
        //Cenário de teste 6: Multiplicação de dois valores sendo um zero e outro negativo
        multiplicar = mult.multiplicar(0, -3);
        System.out.println(multiplicar);
    }
    
}
