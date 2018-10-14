/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.abstractfactory.factories;

import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Bateria;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Camera;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Display;
import br.edu.ifpb.padroes.abstractfactory.produtos.samsung.BateriaSamsung;
import br.edu.ifpb.padroes.abstractfactory.produtos.samsung.CameraSamsung;
import br.edu.ifpb.padroes.abstractfactory.produtos.samsung.DisplaySamsung;

/**
 *
 * @author Lestat
 */
public class SamsungFactory extends AbstractFactory {
    
    private String familia = "Samsung";

    @Override
    public Bateria criarBateria() { return new BateriaSamsung(familia); }
    @Override
    public Camera criarCamera() { return new CameraSamsung(familia); }
    @Override
    public Display criarDisplay() { return new DisplaySamsung(familia); }
    
}
