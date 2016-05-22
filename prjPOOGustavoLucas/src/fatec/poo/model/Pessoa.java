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
public class Pessoa {
    private String cpf;
    private String nome;
    private String endereco;
    private String cidade;
    private String cep;
    private String uf;
    private String ddd;
    private String telefone;
   
    
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
        
    }
    
    public String getcpf() {
        return cpf;
    }

    public String getnome() {
        return nome;
    }

    public String getendereco() {
        return endereco;
    }

    public String getcidade() {
        return cidade;
    }

    public String getcep() {
        return cep;
    }

    public String getuf() {
        return uf;
    }

    public String getddd() {
        return ddd;
    }

    public String gettelefone() {
        return telefone;
    }

    public void setendereco(String endereco) {
        this.endereco = endereco;
    }

    public void setcidade(String cidade) {
        this.cidade = cidade;
    }

    public void setcep(String cep) {
        this.cep = cep;
    }

    public void setuf(String uf) {
        this.uf = uf;
    }

    public void setddd(String ddd) {
        this.ddd = ddd;
    }

    public void settelefone(String telefone) {
        this.telefone = telefone;
    }
   
     
}
