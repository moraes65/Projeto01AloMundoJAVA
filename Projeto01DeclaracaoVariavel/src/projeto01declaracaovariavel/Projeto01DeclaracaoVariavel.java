/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto01declaracaovariavel;

/**
 *
 * @author aluno
 */
public class Projeto01DeclaracaoVariavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        comentarios em mais de uma linha
        */
        
        //comentario em uma linha
        //definir variavel tipo nomeVariavel;
        int idade;
        idade = 15;
        int novaIdade = 20;
        
        //operadores + - / * %(modulo da divisao - resto)
        idade = idade + 10;
        int divisao = 11 % 2;
        
        //sout + tab
        //polimorfismo '+'
        System.out.println("Idade: " + idade);
        
        double pi = 3.14;
        int x = 20;
        x = x / 3;
        System.out.println("Valor X: " + x);
        
        boolean menorIdade = idade < 18;//true;
        System.out.println("Menor Idade: " + menorIdade);
        
        char letraA = 'a';
        System.out.println("LetraA: " + letraA);
        
        int i = 10;
        int j = i;
        i = i + 1;
        System.out.println("Valor i: " + i);
        System.out.println("Valor j: " + j);
        
    }
    
}
