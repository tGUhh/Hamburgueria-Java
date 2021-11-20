/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Snp
 */
public class Produto {
    public int id;
    public String nome;    
    public float valor;

    public Produto(int id, String nome, float valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;        
    }   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }  
    
    @Override
    public String toString(){
        return getNome();
    }
  
    
}
