/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forma_pagamento;

/**
 *
 * @author Amaro
 */
public class FormaPagamento {
    public enum OpcoesMenu {
        CARTAO(1), BOLETO(2), PIX(3);
        
        private final int valor;
        OpcoesMenu(int valorOpcao){
        valor = valorOpcao;
        }
        public int getValor(){
        return valor;
        }
        }
    
}
