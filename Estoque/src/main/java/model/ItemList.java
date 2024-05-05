/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.ItemOBJ;
import java.util.ArrayList;
import view.mainPage;
/**
 *
 * @author Yukinas
 */
public class ItemList {
    
    mainPage mainPage;
    
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
    
    public ItemOBJ getItem(int indexItem){
        return itensList.get(indexItem);
    }
    
    public void editItemListSet(int indice, ItemOBJ itemNew){
        itensList.set(indice, itemNew);
    }
    
    public void removeItemList(int indice){
        itensList.remove(indice);
    }
}
