/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.abstractfactory.factories;

import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Bateria;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Camera;
import br.edu.ifpb.padroes.abstractfactory.produtos.abstratos.Display;
import br.edu.ifpb.padroes.abstractfactory.produtos.microsoft.BateriaMicrosoft;
import br.edu.ifpb.padroes.abstractfactory.produtos.microsoft.CameraMicrosoft;
import br.edu.ifpb.padroes.abstractfactory.produtos.microsoft.DisplayMicrosoft;

/**
 *
 * @author Lestat
 */
public class MicrosoftFactory extends AbstractFactory {
    
    private String familia = "Microsoft";

    @Override
    public Bateria criarBateria() { return new BateriaMicrosoft(familia); }
    @Override
    public Camera criarCamera() { return new CameraMicrosoft(familia); }
    @Override
    public Display criarDisplay() { return new DisplayMicrosoft(familia); }
    
}
