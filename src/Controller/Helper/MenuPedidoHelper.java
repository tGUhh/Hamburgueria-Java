/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Cliente;
import Model.DAO.ProdutoDAO;
import Model.Pedido;
import Model.Produto;
import View.MenuPedido;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Snp
 */
public class MenuPedidoHelper implements IHelper {
    
    private final MenuPedido view;

    public MenuPedidoHelper(MenuPedido view) {
        this.view = view;
    }

    public void preencherTablePedido(ArrayList<Pedido> pedidos) {
        
       DefaultTableModel tableModel = (DefaultTableModel) view.getTabelaPedidos().getModel();
       tableModel.setNumRows(0);  
       
       //Percorrer a lista preenchendo o table model
        for (Pedido pedido : pedidos) {
            tableModel.addRow(new Object[]{
                pedido.getId(),
                pedido.getCliente().getNome(),
                pedido.getProduto(),
                pedido.getValor(),  pedido.getObservacao()
            });
        }
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboboxCliente().getModel();
        
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente); //
        }
    }

   // public void preencherPedidos(ArrayList<Pedido> pedidos) {
     //   DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboboxPedido().getModel();
        
       // for (Pedido produto : pedidos) {
         //   comboBoxModel.addElement(produto);
        //}
    //}    
//VERIFICAR CASO DE ERRO
    public void preencherProdutos(ArrayList<Produto> produtos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboboxProduto().getModel();
        
        for (Produto produto : produtos) {
            comboBoxModel.addElement(produto);            
        }
    }
    public Cliente obterCliente() {
        return (Cliente) view.getjComboboxCliente().getSelectedItem();
    }

    public Produto obterProduto() {
        return (Produto) view.getjComboboxProduto().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getTextValor().setText(valor+"");
              
    }

    
    
    @Override
    public Pedido obterModelo() {
        String idString = view.getTextId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente(); 
        Produto produto = obterProduto();
        String valorString = view.getTextValor().getText();
        float valor = Float.parseFloat(valorString);
        String observacao = view.getTextObservacao().getText();
        
        Pedido pedido = new Pedido(id, cliente, produto, valor, observacao);
        return pedido;
    }

    @Override
    public void LimparTela() {
       view.getTextId().setText("0");
       view.getTextObservacao().setText(" ");
        
    }
      
    
}
