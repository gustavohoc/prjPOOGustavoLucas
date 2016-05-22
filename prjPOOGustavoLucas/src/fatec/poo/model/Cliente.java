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
public class Cliente extends Pessoa{
    
    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedido;
    
    public Cliente(String cpf, String nome, double limCred) {
        super(cpf, nome);
        this.limiteCred = limCred;
        this.limiteDisp = limCred;
        pedido = new ArrayList();
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }

    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteDisp;
    }
    
     
    public void addPedido(Pedido p) {
        pedido.add(p);
        p.setCliente(this);
    }
   
}
