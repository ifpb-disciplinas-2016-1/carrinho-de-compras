/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejb;

import java.util.List;

/**
 *
 * @author IFPB
 */
public interface Carrinho {

    public void add(String p);

    public List<String> listar();

    public void finalizar();
    
    public void remover(String p);
}
