/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author IFPB
 */
@Named(value = "carrinhoMB")
@SessionScoped
public class CarrinhoController implements Serializable {

    @EJB
    private Carrinho carrinho;
    private List<String> listaDeProdutos;
    private String produto;

    public CarrinhoController() {
    }

    @PostConstruct
    public void initObjects() {
        listaDeProdutos = new ArrayList<>();
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setListaDeProdutos(List<String> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    public List<String> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void adicionar() {
        this.carrinho.add(produto);
        listaDeProdutos = this.carrinho.listar();
        this.produto = "";
    }
    
    public void finalizar() {
        this.carrinho.finalizar();
        this.produto = "";
        this.listaDeProdutos = new ArrayList<>();
    }
    
    

}
