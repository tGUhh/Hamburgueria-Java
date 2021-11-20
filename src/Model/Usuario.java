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
public class Usuario extends Pessoa {
    protected String nivelAcesso;
    protected String senha;  
    
        public Usuario(int id, String nivelAcesso, String nome, String telefone, String senha) {
        super(id, nome, telefone);
        this.nivelAcesso = nivelAcesso;
        this.senha = senha;       
    }    

    public Usuario(int id, String nivelAcesso, String nome, String telefone, String email, String senha) {
        super(id, telefone, email, nome);
        this.nivelAcesso = nivelAcesso;
        this.senha = senha;
    }

    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }   

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public String getSenha() {
        return senha;
    }    
    
}
