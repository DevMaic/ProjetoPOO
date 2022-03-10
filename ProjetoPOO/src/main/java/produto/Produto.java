/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produto;

/**
 *
 * @author Amaro
 */
public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private boolean ativo;
    private FotoProduto fotoProduto = new FotoProduto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public FotoProduto getFotoProduto() {
        return this.fotoProduto;
    }

    public void setFotoProduto(FotoProduto fp) {
        this.fotoProduto = fp;
    }
}
