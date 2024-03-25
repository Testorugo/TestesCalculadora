/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadora;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Hugo
 */
public class CalculadoraJunitTest {

    Soma som = new Soma(); // Instanciando a classe Soma
    Divisao div = new Divisao(); // Instanciando a classe Divisao
    Multiplicacao mult = new Multiplicacao(); // Instanciando a classe Multiplicacao
    Subtracao sub = new Subtracao(); // Instanciando a classe Subtracao

    //Cenário de teste 1: Soma de dois valores positivos
    @Test
    public void SomarDoisNumerosPositivos() {

        int soma = som.somar(3, 7);
        assertEquals(10, soma);
    }
    
    //Cenário de teste 2: Soma de dois valores sendo um zero
    @Test
    public void SomarNumeroPositivoEUmZero(){
        int soma = som.somar(3,0);
        assertEquals(3, soma);
    }
    
    //Cenário de teste 3: Soma  de dois valores sendo que ambos são zero
    @Test
    public void SomarDoisZeros(){
        int soma = som.somar(0,0);
        assertEquals(0, soma);
    }
    
    //Cenário de teste 4: Soma de dois valores sendo um negativo
    @Test
    public void SomarNumeroPositivoENumeroNegativo(){
        int soma = som.somar(3,-1);
        assertEquals(2, soma);
    }
    
     //Cenário de teste 5: Soma de dois valores sendo os dois negativos
    @Test
    public void SomarDoisNumerosNegativos(){
        int soma = som.somar(-3,-2);
        assertEquals(-5, soma);
    }
    
    //Cenário de teste 6: Soma de dois valores sendo um zero e outro negativo
    @Test
    public void SomarNumeroNegativoEUmZero(){
        int soma = som.somar(0,-3);
        assertEquals(-3, soma);
    }
    
    //Cenário de teste 1: Subtração de dois valores positivos
    @Test
    public void SubtrairNumerosPositivos(){
        int subtracao = sub.subtrair(7,3);
        assertEquals(4, subtracao);
    }
    
    //Cenário de teste 2: Subtração de dois valores sendo um zero
    @Test
    public void SubtrairNumerosPositivoEUmZero(){
        int subtracao = sub.subtrair(3,0);
        assertEquals(3, subtracao);
    }
    
    //Cenário de teste 3: Subtração  de dois valores sendo que ambos são zero
    @Test
    public void SubtrairDoisZeros(){
        int subtracao = sub.subtrair(0,0);
        assertEquals(0, subtracao);
    }
    
    //Cenário de teste 4: Subtração de dois valores sendo um negativo
    @Test
    public void SubtrairNumeroPositivoENumeroNegativo(){
        int subtracao = sub.subtrair(-1,3);
        assertEquals(-4, subtracao);
    }
    
    //Cenário de teste 5: Subtração de dois valores sendo os dois negativos
    @Test
    public void SubtrairNumerosNegativos(){
        int subtracao = sub.subtrair(-2,-3);
        assertEquals(1, subtracao);
    }
    
    //Cenário de teste 6: Subtração de dois valores sendo um zero e outro negativo
    @Test
    public void SubtrairNumerosNegativosEUmZero(){
        int subtracao = sub.subtrair(-3,0);
        assertEquals(-3, subtracao);
    }
    
    //Cenário de teste 1: Divisão de dois valores positivos sendo o primeiro um numero maior
    @Test
    public void DividirNumerosPositivosSendoOPrimeiroMaior(){
        int divisao = div.dividir(10,5);
        assertEquals(2, divisao);
    }
    
    //Cenário de teste 2: Divisão de dois valores positivos sendo o segundo um numero maior
    @Test
    public void DividirNumerosPositivosSendoOSegundoMaior(){
        int divisao = div.dividir(3,6);
        assertEquals(0, divisao);
    }
    
    //Cenário de teste 3: Divisão de dois valores negativos sendo o primeiro um numero maior
    @Test
    public void DividirNumerosNegativosSendoOPrimeiroMaior(){
        int divisao = div.dividir(-3,-9);
        assertEquals(0, divisao);
    }
    
    //Cenário de teste 4: Divisão de dois valores negativos sendo o segundo um numero maior
    @Test
    public void DividirNumerosNegativosSendoOSegundoMaior(){
        int divisao = div.dividir(-8,-2);
        assertEquals(4, divisao);
    }
    
    //Cenário de teste 5: Divisão de dois valores sendo o segundo negativo
    @Test
    public void DividirNumeroPositivoESegundoNegativo(){
        int divisao = div.dividir(6,-2);
        assertEquals(-3, divisao);
    }
    
    //Cenário de teste 6: Divisão de dois valores sendo o primeiro um zero
    @Test
    public void DividirNumerosNuloPorNumerosPositivos(){
        int divisao = div.dividir(0,3);
        assertEquals(0, divisao);
    }
    
    //Cenário de teste 1: Multiplicação de dois valores positivos
    @Test
    public void MultiplicarNumerosPositivos(){
        int multiplicacao = mult.multiplicar(3,7);
        assertEquals(21, multiplicacao);
    }
    
    //Cenário de teste 2: Multiplicação de numero positivo e um zero
    @Test
    public void MultiplicarNumeroPositivoEUmZero(){
        int multiplicacao = mult.multiplicar(3,0);
        assertEquals(0, multiplicacao);
    }
    
    //Cenário de teste 3: Multiplicação  de dois valores sendo que ambos são zero
    @Test
    public void MultiplicarNumerosNulos(){
        int multiplicacao = mult.multiplicar(0,0);
        assertEquals(0, multiplicacao);
    }
    
    //Cenário de teste 4: Multiplicação de dois valores sendo um positivo e um negativo
    @Test
    public void MultiplicarNumerosPositivoENumeroNegativo(){
        int multiplicacao = mult.multiplicar(3,-1);
        assertEquals(-3, multiplicacao);
    }
    
    //Cenário de teste 5: Multiplicação de dois valores sendo os dois negativos
    @Test
    public void MultiplicarNumerosNegativos(){
        int multiplicacao = mult.multiplicar(-3,-2);
        assertEquals(6, multiplicacao);
    }
    
    //Cenário de teste 6: Multiplicação de dois valores sendo um zero e outro negativo
    @Test
    public void MultiplicarNumerosNuloENumeroNegativo(){
        int multiplicacao = mult.multiplicar(0,-3);
        assertEquals(0, multiplicacao);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
