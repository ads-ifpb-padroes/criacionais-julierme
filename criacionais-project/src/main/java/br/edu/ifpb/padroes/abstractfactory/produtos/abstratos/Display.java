/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.padroes.abstractfactory.produtos.abstratos;

/**
 *
 * @author Lestat
 */
public abstract class Display {
    
    private String familia;

    /* Construtor */
    public Display(String familia) { this.familia = familia; }
    
    /* Get e Set */
    public String getFamilia() { return familia; }
    public void setFamilia(String familia) { this.familia = familia; }

    @Override
    public String toString() { return "Display {Montadora: " + familia + '}'; }
    
}
