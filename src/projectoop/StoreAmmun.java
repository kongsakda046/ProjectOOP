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
public class StoreAmmun extends abstracAmmo  implements Ammunition{
  private String namegun;
    public static int selectmenu,number;
    public static int priceAK=0;
     public static int pricet=0;
     public static int sum=0;
      public static int count=0;
      public static int reduce=1;
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
    Ammo[number] = " "+namemenu +" Price "+ pricet+"  Bath";
    for(int i=0;i<count;i++){
       amount--;
    }
     totalAmmo[number]=amount;
       totalpriceAmmo[number]=pricet;
       sum=sum+(pricet*count);
         number++;
        
        
        
}
public  void add(int t){ 
    count=t;
    for(int i=0;i<count;i++){
       amount++;
    }
    totalAmmo[number]=amount;
        
}

  public int Calculator() {
      System.out.println(sum);
       return sum;
       
    }

   

    
        

}
