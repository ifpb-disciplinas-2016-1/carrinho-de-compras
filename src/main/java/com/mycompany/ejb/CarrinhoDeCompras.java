/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remote;
import javax.ejb.Remove;
import javax.ejb.Stateful;

/**
 *
 * @author IFPB
 */
@Stateful
@Remote(Carrinho.class)
public class CarrinhoDeCompras implements Carrinho {

    private List<String> lista;

    public CarrinhoDeCompras() {
        lista = new ArrayList<>();
    }

    @Override
    public void add(String p) {
        this.lista.add(p);
    }

    @Override
    public List<String> listar() {
        return lista;
    }

    @Override
    @Remove
    public void finalizar() {
        System.out.println(" --- Finalizando --- ");
        lista.stream().forEach(System.out::println);
    }

    @Override
    public void remover(String p) {
        this.lista.remove(p);
    }

}
