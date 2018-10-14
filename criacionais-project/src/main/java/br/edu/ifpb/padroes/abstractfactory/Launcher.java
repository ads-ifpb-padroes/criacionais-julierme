/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.abstractfactory;

import br.edu.ifpb.padroes.abstractfactory.factories.AppleFactory;
import br.edu.ifpb.padroes.abstractfactory.factories.MicrosoftFactory;
import br.edu.ifpb.padroes.abstractfactory.factories.SamsungFactory;

/**
 *
 * @author Lestat
 */
public class Launcher {
    
    public static void main(String [] args){
    
        Smartphone apple = new Smartphone(new AppleFactory());
        System.out.println(apple.toString());
        
        Smartphone microsoft = new Smartphone(new MicrosoftFactory());
        System.out.println(microsoft.toString());
        
        Smartphone samsung = new Smartphone(new SamsungFactory());
        System.out.println(samsung.toString());
        
    }
}
