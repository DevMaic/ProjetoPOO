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
import java.math.BigDecimal;
import cidade.Cidade;

/**
 *
 * @author Amaro
 */
public class Pedido {
    private static final int QUANT_MAX_ITEM = 10;
    private String codigo;
    private BigDecimal subtotal = new BigDecimal("0");
    private BigDecimal taxaFrete;
    private BigDecimal valorTotal;
    private LocalDate dataCriacao;
    private LocalDate dataConfirmacao;
    private LocalDate daraEntrega;
    private LocalDate dataCancelamento;
    private StatusPedido.Status statusPedido;
    private Restaurante restaurante;
    private Usuario usuario;
    private ItemPedido item[] = new ItemPedido[QUANT_MAX_ITEM];
    private int posItem = 0;
    private FormaPagamento formaPagamento;
    private Endereco enderecoEntrega;

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String cep, String logradouro, String numero, String complemento,
                    String bairro, Cidade c) {
        this.enderecoEntrega = new Endereco(cep, logradouro, numero, complemento, bairro, "", "");
        this.enderecoEntrega.setCidade(c);
    }
    
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public ItemPedido getItem(int i) {
        return item[i];
    }
    
    public ItemPedido[] getItens() {
        return this.item;
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

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(String taxaFrete) {
        this.taxaFrete = new BigDecimal(taxaFrete);
    }

    public String getValorTotal() {
        return valorTotal.toString();
    }

    public void setValorTotal(String a) {
        this.valorTotal = new BigDecimal(a);
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
    
    public StatusPedido.Status getStatusPedido() {
        return this.statusPedido;
    }

    public void setStatusPedido(StatusPedido.Status sp) {
        //Assosiado a uma Maquina de Estados
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
        this.statusPedido = StatusPedido.Status.CRIADO;
        this.restaurante = R;
    }
    
    public void addItem(String item, int quant, String obs){
        int i;
       
        i = this.getRestaurante().encontrarProduto(item);
            
        if(i == -1){
            System.out.println("Item não encontrado!" +
                "confira se escreveu corretamente");
        }
        else{
            this.item[this.getPosItem()] = new ItemPedido(quant, obs, this.getRestaurante().getProduto(i));
            this.setSubtotal(this.getSubtotal().
                    add(this.item[posItem].getPrecoTotal()));
            this.setPosItem(this.getPosItem()+1);
        }
    }
    
    public void delItem(String item, int quant, String motivo){
        int i;
        for( i = this.getPosItem()-1; i >= 0; i-- ){
            if(this.getItem(i).getProduto().getNome().equals(item)){
                if( this.item[i].getQuantidade() < quant ){
                    System.out.println("Quantidade invalida, confira a quantidade.");
                    break;
                }
                else{
                    this.item[i].setObservacao("Removido: " + motivo);
                    this.setSubtotal(this.getSubtotal().subtract(this.item[i].getPrecoUnitario()).multiply(BigDecimal.valueOf(quant)));
                    break;
                }
            }
        }
        if(i == -1){
            System.out.println("Esse item não está no pedido");
        }
    }
    
    public String calcTotal(){
        return this.getSubtotal().add(this.getTaxaFrete()).toString();
    }
    
    public String calcFrete(Restaurante R){
        this.setTaxaFrete(this.getEnderecoEntrega().calcularFrete(R.getTaxaFrete()).toString());
        return this.getTaxaFrete().toString();
    }
    
    public String imprimirEndereco(){
        return this.getEnderecoEntrega().toString();
    }
}
