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
public class Pedido {
    private int id;
    private Cliente cliente;
    private Produto produto;   
    private float valor;
    private String observacao;
   
    public Pedido(){
}

    public Pedido(int id, Cliente cliente, Produto produto, float valor) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;        
        this.valor = valor;
        //try{
            //this.data = new SimplesDateFormat("dd/MM/yyyy HH:mm").parse(data);
                     // } catch (ParseException ex){
              //Logger.getLogger(Agendamento.class.getName()).log(Level.SERVE, null, ex);
        //}
    }

    public Pedido(int id, Cliente cliente, Produto produto, float valor, String observacao) {
        this(id, cliente, produto, valor);
        this.observacao = observacao;
    }
    
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    } 

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }    
   
      
}
