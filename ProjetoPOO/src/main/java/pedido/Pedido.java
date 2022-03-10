/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedido;
import java.time.LocalDate; // import the LocalDate class
import restaurante.*;
import usuario.*;
/**
 *
 * @author Amaro
 */
public class Pedido {
    private String codigo;
    private double subtotal;
    private double taxaFrete;
    private double valorTotal;
    private LocalDate dataCriacao;
    private LocalDate dataConfirmacao;
    private LocalDate daraEntrega;
    private LocalDate dataCancelamento;
    private StatusPedido statusPedido;
    private Restaurante restaurante;
    private Usuario usuario;
    
    // Um item ou vários itens?
    private ItemPedido item = new ItemPedido();

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

    public LocalDate getDataCiracao() {
        return dataCriacao;
    }

    public void setDataCiracao(LocalDate dataCiracao) {
        this.dataCriacao = dataCiracao;
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
}
