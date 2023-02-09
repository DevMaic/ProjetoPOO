
package usuario;
import java.time.LocalDate;
import grupo.Grupo;
import pedido.*;
import restaurante.*;
import produto.*;

/**
 *
 * @author Amaro
 */
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private LocalDate dataCadastro;
    protected Grupo grupo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Grupo getGrupo() {
        return this.grupo;
    }
    
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = LocalDate.now();
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.senha = GerarSenha.gerarSenha();
        this.dataCadastro = LocalDate.now();
    }
}

