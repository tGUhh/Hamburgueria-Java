/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Snp
 */
public class ProdutoDAO {
    
    
    /**
     * Insere um servico dentro do banco de dados
     * @param produto exige que seja passado um objeto do tipo servico
     */
    public void insert(Produto produto){
        Banco.produto.add(produto);
    }
    
    /**
     * Atualiza um Objeto no banco de dados
     * @param produto
     * @return 
     */
    public boolean update(Produto produto){
        
        for (int i = 0; i < Banco.produto.size(); i++) {
            if(idSaoIguais(Banco.produto.get(i),produto)){
                Banco.produto.set(i, produto);
                return true;
            }
        }
        return false;      

    }
    
    /**
     * Deleta um objeto do banco de dados pelo id do servico passado
     * @param produto
     * @return 
     */
    public boolean delete(Produto produto){
        for (Produto produtoLista : Banco.produto) {
            if(idSaoIguais(produtoLista,produto)){
                Banco.produto.remove(produtoLista);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna um arraylist com todos os produtos do banco de dados
     * @return uma lista com todos os registros do banco
     */
    public ArrayList<Produto> selectAll(){
        return Banco.produto;
    }
    
    /**
     * Compara se dois objetos tem a propriedade id igual
     * @param produto
     * @param produtoAComparar
     * @return verdadeiro caso os id forem iguais e falso se nao forem
     */
    private boolean idSaoIguais(Produto produto, Produto produtoAComparar) {
        return produto.getId() ==  produtoAComparar.getId();
    }
    
}
