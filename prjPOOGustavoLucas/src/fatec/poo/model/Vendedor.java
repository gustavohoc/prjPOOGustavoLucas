/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Vendedor extends Pessoa{
    
    private double salarioBase;
    private double Comissao;
    private ArrayList<Pedido> pedido;
    
    public Vendedor(String cpf, String nome, double salBase) {
        super(cpf, nome);
        this.salarioBase = salBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getComissao() {
        return Comissao;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setComissao(double Comissao) {
        this.Comissao = Comissao;
    }
    
    public void addPedido(Pedido p) {
        pedido.add(p);
        p.setVendedor(this);
    }
}
