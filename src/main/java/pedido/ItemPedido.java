/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido;

import produto.Produto;
import java.math.BigDecimal;

/**
 *
 * @author Amaro
 */
public class ItemPedido {
    private int quantidade;
    private BigDecimal precoUnitario;
    private BigDecimal precoTotal;
    private String observacao;
    private Produto produto;

    public ItemPedido(int quantidade, String observacao, Produto produto) {      
        this.quantidade = quantidade;
        this.observacao = observacao;
        this.produto = produto;
        this.precoUnitario = produto.getPreco();
        this.precoTotal = this.precoUnitario.multiply(BigDecimal.valueOf(quantidade));
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(String precoUnitario) {
        this.precoUnitario = new BigDecimal(precoUnitario);
    }

    public BigDecimal getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(String precoTotal) {
        this.precoTotal = new BigDecimal(precoTotal);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(Produto p) {
        this.produto = p;
    } 
}
