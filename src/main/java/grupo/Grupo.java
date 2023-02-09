/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import permissao.Permissao;

/**
 *
 * @author Amaro
 */
public class Grupo {
    private String nome;
    private List<Permissao> permissoes;
    
    public Grupo(String nome){
        this.nome = nome;
        this.permissoes = new ArrayList<>();
    }

    public String getPermissao() {
        return Arrays.toString(this.permissoes.toArray());
    }

    public void setPermissao(Permissao permissao) {
        this.permissoes.add(permissao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
