/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;
import util.Endereco;
import java.time.LocalDate; // import the LocalDate class
import java.util.ArrayList;
import java.util.Arrays;
import cozinha.*;
import produto.*;
import forma_pagamento.*;
import usuario.*;

/**
 *
 * @author Amaro
 */
public class Restaurante {
    private static final int QUANT_PRODUTOS = 10;

    private String nome;
    private double taxaFrete;
    private boolean ativo;
    private boolean aberto;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    private Cozinha cozinha;
    private Produto Produtos[] = new Produto[QUANT_PRODUTOS];
    private Endereco endereco;

//    ArrayList<FormaPagamento> formas = new ArrayList<FormaPagamento>();
//    ArrayList<Usuario> responsaveis = new ArrayList<Usuario>();
//    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Produto[] getProdutos() {
        return Produtos;
    }

    public void setProdutos(Produto[] Produtos) {
        this.Produtos = Produtos;
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

    public Restaurante(String nome, double taxaFrete, boolean ativo,
            boolean aberto /*, Cozinha cozinha*/, String cep, String logradouro,
            String bairro, String cidade, String numero, String complemento,
            String estado) {
        this.nome = nome;
        this.taxaFrete = taxaFrete;
        this.ativo = ativo;
        this.aberto = aberto;
        this.dataCadastro = LocalDate.now();
        //this.cozinha = cozinha;
        this.endereco = new Endereco(cep, logradouro, numero, complemento,
                bairro, cidade, estado);
    }
    
    // Outros métodos
    public void cadastrarProduto(String nome, String desc, float prec){
       boolean podeCadastrar = false;
       int i;
       
       for (i=0 ; i < QUANT_PRODUTOS; i++){
           if(this.Produtos[i] == null){
               podeCadastrar = true;
               break;
           }
       }
       
       if(podeCadastrar){
           this.Produtos[i] = new Produto();
           this.Produtos[i].setNome(nome);
           this.Produtos[i].setDescricao(desc);
           this.Produtos[i].setPreco(prec);
           this.Produtos[i].setAtivo(true);
       }
       else{
           System.out.println("Excedeu o limite de produtos!");
       } 
   }
   
   public int encontrarProduto(String nome){
       for (int i=0 ; i < QUANT_PRODUTOS; i++){
           if(this.Produtos[i] != null)
           {
                if(this.Produtos[i].getNome().equals(nome)){
                    return i;
                }
           }
       }
       return -1;
   }
   
   public void ativarProduto(String nome){
       int i = encontrarProduto(nome);
       
       if(i != -1){
            this.Produtos[i].setAtivo(true);
       } else {
            System.out.println("Produto não encontrado. Confira o nome!");
       }
   }
   
   public void desativarProduto(String nome){
       int i = encontrarProduto(nome);
       
       if(i != -1){
            this.Produtos[i].setAtivo(false);
       } else {
            System.out.println("Produto não encontrado. Confira o nome!");
       }
   }

    @Override
    public String toString() {
        return "Restaurante{" + "Produtos=" + Arrays.toString(Produtos) + '}';
    }
   
}
