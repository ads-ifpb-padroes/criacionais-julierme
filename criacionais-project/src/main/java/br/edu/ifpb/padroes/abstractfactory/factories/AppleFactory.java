/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.abstractfactory.factories;

import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Bateria;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Camera;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Display;
import br.edu.ifpb.padroes.abstractfactory.produtos.apple.BateriaApple;
import br.edu.ifpb.padroes.abstractfactory.produtos.apple.CameraApple;
import br.edu.ifpb.padroes.abstractfactory.produtos.apple.DisplayApple;

/**
 *
 * @author Lestat
 */
public class AppleFactory extends AbstractFactory{
    
    private String familia = "Apple";

    @Override
    public Bateria criarBateria() { return new BateriaApple(familia); }
    @Override
    public Camera criarCamera() { return new CameraApple(familia); }
    @Override
    public Display criarDisplay() { return new DisplayApple(familia); }
    
}
