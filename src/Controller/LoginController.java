/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author Snp
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;
    
    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        Usuario usuario = helper.obterModelo();        
        //1-Pegar usuario da View.
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        //2-Pesquisar o usuario no Banco de Dados.
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
            //3-Se o usúario da View tiver o mesmo usuario e senha vindo do banco direcionar para o menu.
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{   
            //4-Senão mostrar uma mensagem ao usuario "Usuario ou senha invalidos".
            view.exibeMensagem("Usuario ou senha invalidos");
        }       
      
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");        
        // this.view.exibeMensagem("Executei o fiz tarefa");
    } 
    
   
    
}
