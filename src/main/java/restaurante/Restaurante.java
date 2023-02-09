
package restaurante;
import util.Endereco;
import java.time.LocalDate;
import cozinha.*;
import produto.*;
import java.util.Arrays;
import java.math.BigDecimal;
import usuario.*;
import grupo.*;

/**
 *
 * @author Amaro
 */
public class Restaurante {
    private static final int QUANT_PRODUTOS = 10;
    private String nome;
    private BigDecimal taxaFrete;
    private boolean ativo;
    private boolean aberto;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;
    private Cozinha cozinha;
    private Endereco endereco;
    private Produto Produtos[] = new Produto[QUANT_PRODUTOS];
    private Responsavel responsavel;
    public enum TipoCozinha {
        Italiana, Arabe, Japonesa, Chineza, Americana, Brasileira, Mexicana, SCD;
    }
            
    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public Produto[] getProdutos() {
        return Produtos;
    }
    
    public Produto getProduto(int i){
        return this.Produtos[i];
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
        
        public BigDecimal getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(String taxaFrete) {
        this.taxaFrete = new BigDecimal(taxaFrete);
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
    
    public void DefinirGrupos(Usuario x, Grupo grupo){
            x.setGrupo(grupo);
    }

    public Restaurante(String nome, String taxaFrete, boolean ativo,
            boolean aberto, String cep, String logradouro,
            String bairro, String cidade, String numero, String complemento,
            String estado) {
        this.nome = nome;
        this.taxaFrete = new BigDecimal(taxaFrete);
        this.ativo = ativo;
        this.aberto = aberto;
        this.dataCadastro = LocalDate.now();
        this.endereco = new Endereco(cep, logradouro, numero, complemento,
                bairro, cidade, estado);
    }
    
   public void cadastrarProduto(String nome, String desc, String prec, 
           Long tam, String content, TipoCozinha tipoCozinha){
       boolean podeCadastrar = false;
       int i;
       
       for (i=0 ; i < QUANT_PRODUTOS; i++){
           if(Produtos[i] == null){
               podeCadastrar = true;
               break;
           }
       }
       
       if(podeCadastrar){
           Produtos[i] = new Produto();
           Produtos[i].setNome(nome);
           Produtos[i].setDescricao(desc);
           Produtos[i].setPreco(prec);
           Produtos[i].setTipoCozinha(tipoCozinha);
           Produtos[i].atualizarFotoProduto(tam, content);
           Produtos[i].setAtivo(true);
       }
       else{
           System.out.println("Exedeu o limite de produtos!");
       } 
   }
   
   public int encontrarProduto(String nome){
       for (int i=0 ; i < QUANT_PRODUTOS; i++){
           if(this.Produtos[i]!= null)
           {
               if(this.Produtos[i].getNome().equals(nome)){
               return i;
               }
           }
       }
       
       return -1;
   }
   
   public void ativarProduto(String nome){
       int i;
       boolean encontrado = false;
       
       i = encontrarProduto(nome);
       if(i !=1){
           encontrado = true;
       }
       
       if(encontrado){
           Produtos[i].setAtivo(true);
           Produtos[i].getFotoProduto().setAtivo(true);
       }
       else{
           System.out.println("Produto não encontrado. Confira o nome!");
       }
   }
   
   public void desativarProduto(String nome){
       int i;
       boolean encontrado = false;
       
       i = encontrarProduto(nome);
       if(i !=1){
           encontrado = true;
       }
       
       if(encontrado){
           Produtos[i].setAtivo(false);
           Produtos[i].getFotoProduto().setAtivo(false);
       }
       else{
           System.out.println("Produto não encontrado. Confira o nome!");
       }
   }

   public void definirResponsavel(Responsavel res){
       this.setResponsavel(res);
   }
   
    @Override
    public String toString() {
        return "Restaurante{" + "Produtos=" + Arrays.toString(Produtos) + '}';
    }
}
