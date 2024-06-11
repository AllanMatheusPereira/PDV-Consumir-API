/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import modelo.Produto;

/**
 *
 * @author allan
 */
public class ProdutoController {
    
    private static ProdutoController instancia;
        
    private ArrayList<Produto>listaProdutos;
            
    public static ProdutoController getInstance(){
        if(instancia == null) {
            return instancia = new ProdutoController();
        }else{
            return instancia;
        }
    }  
    
    private ProdutoController(){

    listaProdutos = new ArrayList<>();
        
    }
    
    public void salvarProduto(Produto produtos){
        listaProdutos.add(produtos);
    }
    public ArrayList<Produto> retornaProduto(){
        return listaProdutos;
    }
        
}
