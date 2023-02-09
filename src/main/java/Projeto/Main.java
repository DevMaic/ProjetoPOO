package Projeto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import cidade.Cidade;
import restaurante.*;
import pedido.*;
import usuario.*;
import grupo.*;
import java.math.BigDecimal;
import permissao.*;

/**
 *
 * @author Amaro
 */
public class Main {
    public static void main (String [] args){
        Usuario U1 = new Usuario("Pedro", "pedo@email.com", "minha-senha");
        Restaurante R1 = new Restaurante("RangoLegal", "5.50", true, true,
        "500300", "Logradouro1", "Orla" ,"Petrolina", "123", "bloco 1", "Pernambuco");
        Responsavel Res = new Responsavel("José Dias", "JosDis@email.com");
        Cidade Juazeiro = new Cidade("Juazeiro", "Bahia");
        Juazeiro.setFrete(BigDecimal.valueOf(3));
        Cidade Petrolina = new Cidade("Petrolina", "Pernambuco");
        Petrolina.setFrete(BigDecimal.valueOf(2));
        
        R1.definirResponsavel(Res);
        
        Grupo admin = new Grupo("admin");
        Grupo recepcao = new Grupo("recepcao");
        Grupo cozinheiro = new Grupo("cozinheiro");
        Grupo gerente = new Grupo("gerente");
        
        Permissao financeiro = new Permissao(TiposDePermissoes.FINANCEIRO);
        Permissao cozinha = new Permissao(TiposDePermissoes.COZINHA);
        Permissao relatorios = new Permissao(TiposDePermissoes.RELATORIOS);
        Permissao regras = new Permissao(TiposDePermissoes.REGRAS);
        Permissao telas = new Permissao(TiposDePermissoes.TELAS);
       
        admin.setPermissao(telas);
        admin.setPermissao(financeiro);
        admin.setPermissao(cozinha);
        admin.setPermissao(relatorios);
        admin.setPermissao(regras);
        recepcao.setPermissao(telas);
        cozinheiro.setPermissao(cozinha);
        gerente.setPermissao(telas);
        gerente.setPermissao(cozinha);
        gerente.setPermissao(relatorios);
        
        R1.DefinirGrupos(Res,admin);
        R1.DefinirGrupos(U1, gerente);
        
        
        R1.cadastrarProduto("X-burguer", "Carne, queijo", "15.9", 2l, "1", Restaurante.TipoCozinha.Americana);
        R1.cadastrarProduto("X-salada", "Carne, queijo, salada", "19.9", 2l, "2", Restaurante.TipoCozinha.Americana);
        R1.cadastrarProduto("Coca-Cola Lata", "", "5", 1l, "3", Restaurante.TipoCozinha.SCD);
        R1.cadastrarProduto("Coca-Cola Zero Lata", "", "5", 1l, "4", Restaurante.TipoCozinha.SCD);
        R1.cadastrarProduto("Guarana Lata", "", "5", 1l, "5", Restaurante.TipoCozinha.SCD);
        
        R1.desativarProduto("Coca-Cola Zero Lata");
        
        Pedido Ped = new Pedido(R1, U1);
        Ped.setEnderecoEntrega("56322000", "", "500", "Apt 103", "Centro", Petrolina);

        Ped.addItem("Guarana Lata", 1, "");
        Ped.addItem("X-salada", 2, "");
        Ped.delItem("X-salada", 1, "apenas 1");
        
        System.out.println("Subtotal: " + Ped.getSubtotal() + "\n" 
                           + "Frete: " + Ped.calcFrete(R1) + "\n"
                           + "Total: " + Ped.calcTotal() + "\n");
        System.out.println("Endereço de Entrega: " + Ped.imprimirEndereco());
    }
}
