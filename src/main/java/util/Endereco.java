package util;

import cidade.Cidade;
import java.math.BigDecimal;
/**
 *
 * @author Amaro
 */
public class Endereco implements Destinatario{
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private Cidade cidade;

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogadouro() {
        return logradouro;
    }

    public void setLogadouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Endereco(String cep, String logradouro, String numero, String complemento,
                    String bairro, String cidade, String estado) 
    {
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = new Cidade(cidade, estado);
    }

    @Override
    public BigDecimal calcularFrete(BigDecimal resFret) {
        //encontrar a rua baseado no CEP
        return this.cidade.getFrete().add(resFret);
    }

    @Override
    public String toString() {
        return "cep= " + cep + ", logradouro= " + logradouro + ", numero= " +
                numero + ", complemento= " + complemento + ", bairro= " + bairro
                + ", cidade= " + cidade.toString();
    }
}
