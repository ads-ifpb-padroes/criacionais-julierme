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
public abstract class Camera {
    
    private String familia;

    /* Construtor */
    public Camera(String familia) { this.familia = familia; }
    
    /* Get e Set */
    public String getFamilia() { return familia; }
    public void setFamilia(String familia) { this.familia = familia; }

    @Override
    public String toString() { return "Camera {Montadora: " + familia + '}'; }
    
}
