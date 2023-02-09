/*nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click  to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;

import grupo.Grupo;
import permissao.*;

/**
 *
 * @author Amaro
 */
public class Responsavel extends Usuario{
    
    public Responsavel(String nome, String email, String senha) {
        super(nome, email, senha);
    }
    
    public Responsavel(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void setGrupo(Grupo grupo) {
        
        Permissao financeiro = new Permissao(TiposDePermissoes.FINANCEIRO);
        Permissao cozinha = new Permissao(TiposDePermissoes.COZINHA);
        Permissao relatorios = new Permissao(TiposDePermissoes.RELATORIOS);
        Permissao regras = new Permissao(TiposDePermissoes.REGRAS);
        Permissao telas = new Permissao(TiposDePermissoes.TELAS);
        
        Grupo fullAccess = new Grupo("fullAccess");
        fullAccess.setPermissao(telas);
        fullAccess.setPermissao(financeiro);
        fullAccess.setPermissao(cozinha);
        fullAccess.setPermissao(relatorios);
        fullAccess.setPermissao(regras);

        this.grupo = fullAccess;
    }
}
