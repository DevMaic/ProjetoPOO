/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produto;
import java.math.BigDecimal;
import restaurante.Restaurante.TipoCozinha;

/**
 *
 * @author Amaro
 */
public class Produto {
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private boolean ativo;
    private FotoProduto fotoProduto = new FotoProduto();
    private TipoCozinha tipoCozinha;

    public TipoCozinha getTipoCozinha() {
        return tipoCozinha;
    }

    public void setTipoCozinha(TipoCozinha tipoCozinha) {
        this.tipoCozinha = tipoCozinha;
    }

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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = new BigDecimal(preco);
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

    public void atualizarFotoProduto(Long tam, String content){
        this.getFotoProduto().setNome(this.getNome());
        this.getFotoProduto().setDescricao(this.getDescricao());
        this.getFotoProduto().setTamanho(tam);
        this.getFotoProduto().setContentType(content);
    }
    
    @Override
    public String toString() {
        return "\nProduto{" + "nome=" + nome + "\n descricao=" + descricao + 
                "\n preco=" + preco + "\n ativo=" + ativo + "\n fotoProduto=" 
                + fotoProduto + '}' + "\n----------------------------\n";
    }
}
