/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package novice;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Novice {

    private int atk ;
    private int exp;
    private int hp;
    
    
    //Initial Value Public + Classname
    public Novice(int inputValue){
        atk = 100;
        hp = inputValue;
        exp = 0;
}
     public void startGame(int inputValue) {
        System.out.println("Start");
        System.out.println("Your HP : " + inputValue );
    }
      public void killing(Novice player) {
        if (player.hp > 0){
            System.out.println("Kill ! !");
            System.out.println(". . .");
            System.out.println(". . .");
            System.out.println("Finish");
            System.out.println("+ 25 exp  + 40 attack ");
            player.exp += 25;
            player.atk += 40;
        } else {
            System.out.println("---------THE-END---------");
        }
        
    }
       public void updateHP (Novice player) {
        player.hp = player.hp - 100;
        
    }
       public void showValue(Novice player) {
        System.out.println("HP : " + player.hp);
        System.out.println("Attack : " + player.atk);
        System.out.println("Exp : " + player.exp);
        
    }
       
 
     public static void main(String args[]) {
         Bag myBag = new Bag();
         Item itembag=new Item();
         
         System.out.println("Your potion " + myBag.potion);
         System.out.println("Your weapon " + myBag.weapon);
         System.out.println("Your custom " + myBag.custom);
          
         System.out.print("What you want to add item to bag (yes/no): ");
         Scanner sc = new Scanner(System.in);
         
         String select = sc.next();
         String item;
         
         while("yes".equals(select)){
         System.out.print("Select item (potion/weapon/custom): ");
         item = sc.next();
         myBag.addItem(item);
         itembag.addItem(item);
         
         System.out.print("What you want to add (yes/no): ");
         select = sc.next();
         }
         //myBag.print1();
         itembag.print1();
         itembag.print2();
         /*System.out.println("Your potion " + myBag.potion);
         System.out.println("Your weapon " + myBag.weapon);
         System.out.println("Your custom " + myBag.custom);*/
         
        
        System.out.println(" * * R a g n a r o k * * ");
        Novice player = new Novice(500);
        int round=1;
        player.startGame(player.hp);
        while (player.hp > 0) {
            System.out.println("----------Round"+round+"----------");
            player.killing(player);
            if (player.hp >= 0) {
                System.out.println("Current status");
                player.updateHP(player);
                player.showValue(player);
            }
            round++;
        }
        System.out.println("---------THE-END---------");
    }
}