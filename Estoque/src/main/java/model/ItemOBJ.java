/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class ItemOBJ {
    private String nome;
    private String quantidade;
    public ItemOBJ(){
        nome = "";
        quantidade = "0";
        
    }
    
    public String getNome (){
        return this.nome;
    }
    
    public String getQuantidade (){
        return this.quantidade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQuantidade(String quantidade){
        this.quantidade = quantidade;
    }
  
}
