/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Pedido;
import java.util.ArrayList;

/**
 *
 * @author Snp
 */
public class PedidoDAO {

    public PedidoDAO() {
    }
    
    
    /**
     * Insere um pedido dentro do banco de dados
     * @param pedido exige que seja passado um objeto do tipo pedido
     */
    public void insert(Pedido pedido){
          
        if(pedido.getId() == 0){
            pedido.setId(proximoId());
            Banco.pedido.add(pedido);
        }       
        
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param pedido
     * @return 
     */
    public boolean update(Pedido pedido){
        
        for (int i = 0; i < Banco.pedido.size(); i++) {
            if(idSaoIguais(Banco.pedido.get(i),pedido)){
                Banco.pedido.set(i, pedido);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do agendamento passado
     * @param pedido
     * @return 
     */
    public boolean delete(Pedido pedido){
        for (Pedido pedidoLista : Banco.pedido) {
            if(idSaoIguais(pedidoLista,pedido)){
                Banco.pedido.remove(pedidoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os agendamentos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Pedido> selectAll(){
        return Banco.pedido;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param pedido
     * @param pedidoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Pedido pedido, Pedido pedidoAComparar) {
        return pedido.getId() ==  pedidoAComparar.getId();
    }
    
    private int proximoId(){
        
        int maiorId = 0;
        
        for (Pedido pedido : Banco.pedido) {           
           int id = pedido.getId();
            
            if(maiorId < id){
                maiorId = id;
            }
            
        }
        
        return maiorId + 1;
    }
    
}
