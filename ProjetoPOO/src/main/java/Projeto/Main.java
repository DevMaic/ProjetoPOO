package Projeto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import restaurante.*;
import pedido.*;
import usuario.*;

/**
 *
 * @author Amaro
 */
public class Main {
    public static void main (String [] args){
        Usuario U1 = new Usuario("Pedro", "pedo@email.com", "minha-senha");
        Restaurante R1 = new Restaurante("RangoLegal", 5.50f, true, true,
        "500300", "Logradouro1", "Orla" ,"Petrolina", "123", "bloco 1",
        "Pernambuco");
        
        R1.cadastrarProduto("X-burguer", "Carne, queijo", 15.9f);
        R1.cadastrarProduto("X-salada", "Carne, queijo, salada", 17.9f);
        R1.cadastrarProduto("Coca-Cola Lata", "", 5f);
        R1.cadastrarProduto("Guarana Lata", "", 5f);
        
        /*System.out.println(R1.toString());
        
        R1.desativarProduto("Coca-Cola Lata");
        
        System.out.println(R1.toString()); */
        
        Pedido Ped = new Pedido(R1, U1);
        
        Ped.addItem("Guarana Lata", 1, "");
        Ped.addItem("X-salada", 1, "");
        
        System.out.println("Subtotal:" + Ped.getSubtotal());
    }
}
