/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.builder;

import br.edu.ifpb.padroes.builder.Pizza.MassaPan;
import br.edu.ifpb.padroes.builder.Pizza.MassaTradicional;
import java.io.Serializable;

/**
 *
 * @author Lestat
 */
public class PizzaBuilder implements Serializable {
    
    private Pizza pizza;
    
    public PizzaBuilder comMassaTradicional(){
        pizza = new MassaTradicional();
        System.out.println("Com Massa Tradicional");
        return this;
    }
    
    public PizzaBuilder comMassaPan(){
        pizza = new MassaPan();
        System.out.println("Com Massa Pan");
        return this;
    }
    
    public PizzaBuilder comAzeitona(){
        System.out.println("Azeitona adicionada");
        return this;
    }
    
    public PizzaBuilder comCalabresa(){
        System.out.println("Calabresa adicionada");
        return this;
    }
    
    public PizzaBuilder comMussarela(){
        System.out.println("Mussarela adicionada");
        return this;
    }
    
    public PizzaBuilder comPeitoDePeru(){
        System.out.println("Peito de Peru adicionada");
        return this;
    }
    
    public PizzaBuilder comPresunto(){
        System.out.println("Presunto adicionada");
        return this;
    }
    
    public PizzaBuilder comTomate(){
        System.out.println("Tomate adicionada");
        return this;
    }
    
    public Pizza build(){
        return pizza.build();
    }
    
}
