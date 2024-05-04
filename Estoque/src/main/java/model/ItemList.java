/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author Yukinas
 */
public class ItemList {
    
    ArrayList<ItemOBJ> itensList;
    public ItemList(){
       itensList = new ArrayList<>();
    }
    
    public void addItem(ItemOBJ item){
        itensList.add(item);
    }
    
    public int indexItem(ItemOBJ item){  
        return this.itensList.indexOf(item);
    }
    
    public void editItemSet(int indice, ItemOBJ itemNew){
        itensList.set(indice, itemNew);
    }
}
