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
import java.util.Scanner;

public class Storegun extends abstracGun  implements Gun{
    private String namegun;
    public static int selectmenu,number;
    public static int priceAK=0;
     public static int price=0;
     public static int sum=0;
      public static int count=0;
     public static int amount=100;
     
     
    public static String namemenu="";
    public  int  ame;



public  void buy(){ 
    gun[number] = " "+namemenu +" Price "+ price+"  Bath";
    for(int i=0;i<count;i++){
       amount--;
    }
     totalgun[number]=amount;
       totalprice[number]=price;
       sum=sum+(price*count);
         number++;
        
        
}
public  void add(int t){
    count=t;
   gun[number] = " Emtry";
    for(int i=0;i<count;i++){
       amount++;
    }
     totalgun[number]=amount;
       totalprice[number]=0;
      
         number++;

        
        
}

    @Override
    public int Calculator() {
       
       return sum;
    }

    

    
        

}
 
   

     
    
    

    

