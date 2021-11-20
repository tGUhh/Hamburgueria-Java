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
public class Cliente extends Pessoa{
     protected String endereco;
     protected String bairro;

    public Cliente(int id, String nome, String telefone) {
        super(id, nome, telefone);
    }
    
    public Cliente(int id, String nome, String endereco, String bairro, String telefone, String email) {
        super(id, telefone, email, nome);
        this.endereco = endereco;
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    @Override
    public String toString(){
        return getNome();
    }

   
    
    

   
     
     
    
}
