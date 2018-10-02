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
public abstract class Pizza {

    public Pizza() {
    }
    
    public Pizza build(){
        return this;
    }
    
    public static class MassaPan extends Pizza{
        public MassaPan(){
            super();
        }
    }
    
    public static class MassaTradicional extends Pizza{
        public MassaTradicional(){
            super();
        }
    }
    
}
