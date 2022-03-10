/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;
import java.time.LocalDate; // import the LocalDate class
import java.util.ArrayList;
import cozinha.*;
import produto.*;
import forma_pagamento.*;
import Endereco;
import usuario.*;

/**
 *
 * @author Amaro
 */
public class Restaurante {
    private String nome;
    private double taxaFrete;
    private boolean ativo;
    private boolean aberto;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;
    private Cozinha cozinha;
    private Endereco endereco;
    private Produto produto = new Produto();

//    Dessa forma?
//    ArrayList<Produto> produtos = new ArrayList<Produto>();
//    ArrayList<FormaPagamento> formas = new ArrayList<FormaPagamento>();
//    ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }
        
    public void setNome(String nome) {
        this.nome = nome;
    }
        
        public double getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(double taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }
    
    public Cozinha getCozinha() {
        return this.cozinha;
    }

    public void setCozinha(Cozinha cozinha) {
        this.cozinha = cozinha;
    }
    
}
