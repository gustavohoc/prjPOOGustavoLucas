/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Lucas
 */
public class Vendedor extends Pessoa{
    
    private double salarioBase;
    private double Comissao;
    
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
    
}
