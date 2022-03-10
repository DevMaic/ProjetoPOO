/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo;
import permissao.Permissão;

/**
 *
 * @author Amaro
 */
public class Grupo {
    private String nome;
    private Permissão permissao;

    public Permissão getPermissao() {
        return this.permissao;
    }

    public void setPermissao(Permissão permissao) {
        this.permissao = permissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
