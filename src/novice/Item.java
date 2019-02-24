/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novice;

/**
 *
 * @author Notebook-Acer
 */

public class Item extends Bag {
    public int potion;
    public int custom;
    public int weapon;
    public int item_A;
    public int item_B;
    
    public Item () {
        super();
        this.item_A = 0;
        this.item_B = 0;
    }
    
    public void add(String select) {
        if("item_A".equals(select))
            this.item_A++;
        else if("item_B".equals(select))
            this.item_B++;
        else if("potion".equals(select))
            this.potion++;
        else if("custom".equals(select))
            this.custom++;
        else if("weapon".equals(select))
            this.weapon++;
    }
    public void print2(){
    //Bag bag_item = new Bag();
    System.out.println("item in bag: "+ this.item_A);
    System.out.println("item in bag: "+ this.item_B);
    }
    
}
