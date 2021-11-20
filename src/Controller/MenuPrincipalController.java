/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.CadastroUsuarios;
import View.ConsultarUsuarios;
import View.MenuPedido;
import View.MenuPrincipal;

/**
 *
 * @author Snp
 */
public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaPedido(){        
        MenuPedido menuPedido = new MenuPedido(); 
        menuPedido.setVisible(true);
        
    }
    
    public void navegarParaCadastroUsuarios(){
        CadastroUsuarios cadastroUsuarios = new CadastroUsuarios();
        cadastroUsuarios.setVisible(true);
    
    }
    
    public void  ConsultarUsuarios(){
         ConsultarUsuarios  consultarUsuarios = new  ConsultarUsuarios();
         consultarUsuarios.setVisible(true);
    }
    
}
