/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package permissao;

/**
 *
 * @author Amaro
 */
public class Permissao {
    private String nome;
    private String descricao;
    private TiposDePermissoes permissao;

    public Permissao(String nome, String descricao){
        this.nome = nome;
        this.descricao = descricao;
    }

    public Permissao(TiposDePermissoes permissao){
        this.permissao = permissao;
    }

	public TiposDePermissoes getPermissao() {
		return this.permissao;
	}

	public void setPermissao(TiposDePermissoes permissao) {
		this.permissao = permissao;
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
    
    @Override
    public String toString() {
        return "\n" + this.nome + "{ " + this.descricao + "}\n";
    }
}
