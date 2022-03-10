/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;
import java.time.LocalDate; // import the LocalDate class
import grupo.Grupo;
/**
 *
 * @author Amaro
 */
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private LocalDate dataCadastro;
    private Grupo grupo;

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
    
    public void setGrupo(Grupo g) {
        this.grupo = g;
    }
}
