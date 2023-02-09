/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cidade;
import estado.Estado;
import java.math.BigDecimal;

/**
 *
 * @author Amaro
 */
public class Cidade {
    private String nome;
    private Estado estado;
    private BigDecimal frete;

    public BigDecimal getFrete() {
        return frete;
    }

    public void setFrete(BigDecimal frete) {
        this.frete = frete;
    }
    
    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = new Estado(estado);
    }

    @Override
    public String toString() {
        return nome + ", estado= " + estado.getNome();
    }
}
