/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.builder;

/**
 *
 * @author Lestat
 */
public class PizzaMain {
    
    public static void main (String[]args){
        
        Pizza pizza = new PizzaBuilder().comMassaPan().comAzeitona().comMussarela().build();
        System.out.println("====================");
        pizza = new PizzaBuilder().comMassaTradicional().comCalabresa().comTomate().build();
        System.out.println("====================");
        pizza = new PizzaBuilder().comMassaPan().comPeitoDePeru().build();
        System.out.println("====================");
        pizza = new PizzaBuilder().comMassaTradicional().comPresunto().comMussarela().build();
        
    }
    
}
