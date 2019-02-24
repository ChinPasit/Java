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
public class Job extends Novice{
    public String knight;
    public String priest;
    public String wizzard;

    public Job(int inputValue) {
        super(inputValue);
    }
    public void setTank(String knight){
        this.knight = knight;
    }
    public void setSupport(String priest){
        this.priest = priest;
    }
    public void setAttack(String wizzard){
        this.wizzard = wizzard;
    }
    public void showknight(){
        //System.out.println(""+ tank);
        System.out.println("Job of Novice is Swordman");
        
    }
     public void showpriest(){
        //System.out.println(""+ support);
        System.out.println("Job of Novice is Acolyte");
    }
    public void showwizzard(){
        //System.out.println(""+ attack);
        System.out.println("Job of Novice is Archer or Merchant");
    }
   public void showJob(){
       System.out.println("No. 1) : knight");
       System.out.println("No. 2) : priest");
       System.out.println("No. 3) : wizzard");
}
}
