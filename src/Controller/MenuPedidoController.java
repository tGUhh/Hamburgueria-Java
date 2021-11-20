/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.MenuPedidoHelper;
import Model.Cliente;
import Model.DAO.ClienteDAO;
import Model.DAO.PedidoDAO;
import Model.DAO.ProdutoDAO;
import Model.Pedido;
import Model.Produto;
import View.MenuPedido;
import java.util.ArrayList;

/**
 *
 * @author Snp
 */
public class MenuPedidoController {
    
    private final MenuPedido view;
    private final MenuPedidoHelper helper;
    
    public MenuPedidoController(MenuPedido view) {
        this.view = view;
        this.helper = new MenuPedidoHelper(view);
    }
    
   public void atualizaTabelaPedido(){ 
      
        //Buscar lista de peduidos do banco de dados
        PedidoDAO pedidoDAO = new PedidoDAO();
        ArrayList<Pedido> pedidos = pedidoDAO.selectAll();
        //Exibir esta lista na view.
        helper.preencherTablePedido(pedidos);
        
    
   }
   
   public void atualizaCliente(){   
    // Buscar Clientes do Banco de Dados.
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        // Exibir Cliente no Combobox Cliente
        helper.preencherClientes(clientes);
   }
   
   //public void atualizaPedido(){
       
       //PedidoDAO pedidoDAO = new PedidoDAO();
       //ArrayList<Pedido> pedidos = pedidoDAO.selectAll();
       
       //helper.preencherPedidos(pedidos);
       
   //}
   
    public void atualizaProduto(){
        
        ProdutoDAO produtoDAO = new ProdutoDAO();
        ArrayList<Produto> produtos = produtoDAO.selectAll();
        
        helper.preencherProdutos(produtos);
    } 
    
    public void atualizaValor(){
        Produto produto = helper.obterProduto();
        helper.setarValor((float) produto.getValor());
    }
    
    public void agendar(){
        //Buscar Objeto Agendamento da Tela.
        Pedido pedido = helper.obterModelo();
        //Salva Objeto no banco de dados.
        new PedidoDAO().insert(pedido);
        atualizaTabelaPedido();
        helper.LimparTela();
    }   
   
}
