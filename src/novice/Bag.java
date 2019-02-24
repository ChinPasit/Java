/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novice;

/**
 *
 * @author ACER
 */
public class Bag {
    public int potion;
    public int custom;
    public int weapon;

 public Bag (){
     this.potion = 0;
     this.custom = 0;
     this.weapon = 0;
       }
public void addItem(String select) {
        
        if("potion".equals(select))
            this.potion++;
        else if("custom".equals(select))
            this.custom++;
        else if("weapon".equals(select))
            this.weapon++;
    }
    public void print1(){
    //Bag bag_item = new Bag();
    System.out.println("potion in bag: "+ this.potion);
    System.out.println("custom in bag: "+ this.custom);
    System.out.println("weapon in bag: "+ this.weapon);
    }


 
}