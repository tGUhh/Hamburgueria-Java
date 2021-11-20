/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Pedido;
import Model.Cliente;
import Model.Produto;
import Model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author tiago
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Cliente> cliente;
    public static ArrayList<Produto> produto;
    public static ArrayList<Pedido> pedido;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        cliente = new ArrayList<Cliente>();
        produto = new ArrayList<Produto>();
        pedido = new ArrayList<Pedido>();
        
        //criando elementos
        //Usuario(int id, String nivelAcesso, String nome, String telefone, String email, String senha) {
        Usuario usuario1 = new Usuario(1, "Atendente", "J", "31990801030", "joao@gmail.com", "123");
        Usuario usuario2 = new Usuario(2, "Gerete", "Claudio", "3199887766", "claudio@gmail.com", "123");
         
        Cliente cliente1 = new Cliente(1, "Alan Figueiredo", "Rua jaboti 35 ", "Capelinha", "3193300012", "alanfigueiredo@gmail.com");
        Cliente cliente2 = new Cliente(2, "Judite Oliveira", "Rua campo bom 78", "Jardim do Lago", "3193300045", "juditeoliveirapet@gmail.com");
        Cliente cliente3 = new Cliente(3, "Paulo Ricado", "Rua Tres Irmaos 30", "Centro", "31933007496", "pauloricardopet@gmail.com");
        Cliente cliente4 = new Cliente(4, "Neymar Santos", "Rua Lombardi 40", "Canadá", "31999816991", "neymarsantospet@gmail.com");
        Cliente cliente5 = new Cliente(5, "Debruine Pipoqueiro", "Rua pedro quaresma 784", "Lourdes", "31933000847", "debruinepet@gmail.com");
        Cliente cliente6 = new Cliente(6, "Matuidi Pareira", "Rua champions 10", "Franca",  "31933000782",  "matuidipet@gmail.com");
        Cliente cliente7 = new Cliente(7, "Marta de Souza", "Rua tesla 215",  "Horto", "31998826909",  "martasouzapet@gmail.com");
        Cliente cliente8 = new Cliente(8, "Aline Ferrari", "Rua hyrule 32", "Prado", "318475123687", "alineferraripet@gmail.com");
        Cliente cliente9 = new Cliente(9, "Samuel Coltinho", "Rua floresta 12", " Dom Bosco", "319330046364", "samuelcoltinhopet@gmail.com");
        Cliente cliente10 = new Cliente(10, "Felipe Luis", "Rua marechal 1023", "Praia", "31933000874", "felipeluispet@gmail.com");
        
        Produto produto1 = new Produto(1, "X-EGG", 18);
        Produto produto2 = new Produto(2, "X-EGG BACON", 30);
        Produto produto3 = new Produto(3, "X-TUDO", 15);
        Produto produto4 = new Produto(4, "X-MILHO", 25);
        Produto produto5 = new Produto(5, "X-SALADA", 10);
        Produto produto6 = new Produto(6, "MEGA BURGER", 50);
        // Pedido(int id, Cliente cliente, Produto produto, double valor)
        Pedido pedido1 = new Pedido(1, cliente1, produto2, 30);
        Pedido pedido2 = new Pedido(2, cliente3, produto4, 25);
        Pedido pedido3 = new Pedido(3, cliente4, produto1, 18);
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        cliente.add(cliente4);
        cliente.add(cliente5);
        cliente.add(cliente6);
        cliente.add(cliente7);
        cliente.add(cliente8);
        cliente.add(cliente9);
        cliente.add(cliente10);
        
        produto.add(produto1);
        produto.add(produto2);
        produto.add(produto3);
        produto.add(produto4);
        produto.add(produto5);
        produto.add(produto6);
        
        pedido.add(pedido1);
        pedido.add(pedido2);
        pedido.add(pedido3);
        
    }
    
    
}
