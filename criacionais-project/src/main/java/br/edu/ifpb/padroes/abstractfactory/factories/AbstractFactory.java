/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.abstractfactory.factories;

import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Bateria;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Camera;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Display;

/**
 *
 * @author Lestat
 */
public abstract class AbstractFactory {
    
    public abstract Bateria criarBateria();
    public abstract Camera criarCamera();
    public abstract Display criarDisplay();
    
}
