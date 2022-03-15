/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido;
import util.Endereco;
import java.time.LocalDate; // import the LocalDate class
import restaurante.*;
import usuario.*;
import forma_pagamento.FormaPagamento;
import produto.*;

/**
 *
 * @author Amaro
 */
public class Pedido {
    private static final int QUANT_MAX_ITEM = 10;
    private String codigo;
    private double subtotal = 0;
    private double taxaFrete;
    private double valorTotal;
    private LocalDate dataCriacao;
    private LocalDate dataConfirmacao;
    private LocalDate daraEntrega;
    private LocalDate dataCancelamento;
    private StatusPedido statusPedido;
    private Restaurante restaurante;
    private Usuario usuario;
    private ItemPedido item[] = new ItemPedido[QUANT_MAX_ITEM];
    private int posItem = 0;
    private FormaPagamento formaPagamento;
    private Endereco enderecoEntrega;

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public ItemPedido[] getItem() {
        return item;
    }

    public void setItem(ItemPedido[] item) {
        this.item = item;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public Restaurante getRestaurante() {
        return this.restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
	}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(double taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDate getDataConfirmacao() {
        return dataConfirmacao;
    }

    public void setDataConfirmacao(LocalDate dataConfirmacao) {
        this.dataConfirmacao = dataConfirmacao;
    }

    public LocalDate getDaraEntrega() {
        return daraEntrega;
    }

    public void setDaraEntrega(LocalDate daraEntrega) {
        this.daraEntrega = daraEntrega;
    }

    public LocalDate getDataCancelamento() {
        return dataCancelamento;
    }

    public void setDataCancelamento(LocalDate dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }
    
    public StatusPedido getStatusPedido() {
        return this.statusPedido;
    }

    public void setStatusPedido(StatusPedido sp) {
        this.statusPedido = sp;
    }

    public int getPosItem() {
        return posItem;
    }

    public void setPosItem(int posItem) {
        this.posItem = posItem;
    }
    
    public Pedido(Restaurante R, Usuario U){        
        this.usuario = U;
        this.dataCriacao = LocalDate.now();
        //P.setStatusPedido();
        this.restaurante = R;
    }
    
    public void addItem(String item, int quant, String obs){
        int i;
        
        i = this.getRestaurante().encontrarProduto(item);
        Produto prod[] = this.getRestaurante().getProdutos();
            
        if(i == -1){
            System.out.println("Item não encontrado!" +
                "confira se escreveu corretamente");
        }
        else{
            this.item[this.getPosItem()] = new ItemPedido(quant, obs, prod[i]);
            this.setSubtotal(this.getSubtotal() + 
                    this.item[posItem].getPrecoTotal());
            this.setPosItem(this.getPosItem()+1);
        }
    }
}
