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
public class Pessoa {
    protected int id;
    protected String telefone;
    protected String email;
    protected String nome;   
    
   public Pessoa(int id, String nome, String telefone){
       this.id = id;
       this.nome = nome;
       this.telefone = telefone;
       }

    public Pessoa(int id, String telefone, String email, String nome) {
        this.id = id;
        this.telefone = telefone;
        this.email = email;
        this.nome = nome;   
    }

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }   
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
