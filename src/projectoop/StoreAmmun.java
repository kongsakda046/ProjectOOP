/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;

/**
 *
 * @author I'din na
 */
public class StoreAmmun implements Ammunition{
  private String namegun;
    public static int selectmenu,number;
    public static int priceAK=0;
     public static int price=0;
     public static int sum=0;
      public static int count=0;
     public static int amount=100;
     
    public static String namemenu="";
    public  int  ame;
    public void shopgun ( String namegun){
       this.namegun=namegun;
    }
     public String shopgun1( ){
        return namegun;
    }



public  void buy(){ 
    Ammo[number] = " "+namemenu +" Price "+ price+"  Bath";
       amount--;
     totalAmmo[number]=amount-number;
       totalpriceAmmo[number]=price;
       sum=sum+(price);
         number++;
        
        
}
public  void add(){ 
    Ammo[number] = " "+namemenu +" Price "+ price+"  Bath";
       amount++;
     totalAmmo[number]=amount+number;
       totalpriceAmmo[number]=price;
       sum=sum+(price);
         number++;
        
        
}

    public void Calculator() {
       System.out.println("Total  "+sum);
       
    }

    
        

}
