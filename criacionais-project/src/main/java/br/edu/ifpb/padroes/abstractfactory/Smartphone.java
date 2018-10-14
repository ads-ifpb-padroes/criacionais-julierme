/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.abstractfactory;

import br.edu.ifpb.padroes.abstractfactory.factories.AbstractFactory;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Bateria;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Camera;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Display;

/**
 *
 * @author Lestat
 */
public class Smartphone {
    
    private Bateria bateria;
    private Display display;
    private Camera camera;
    private AbstractFactory fabrica;

    /* Construtor */
    public Smartphone(AbstractFactory fabrica){
        this.fabrica = fabrica;
        bateria = fabrica.criarBateria();
        camera = fabrica.criarCamera();
        display = fabrica.criarDisplay();
    }

    @Override
    public String toString() { return "Smartphone {" + bateria + "; " + display + "; " + camera ; }
    
}
