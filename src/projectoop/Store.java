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

public class Store extends abstracGun implements Ammunition,Gun{
    private String namegun;
    public static int selectmenu,number;
    public static int priceAK=0;
     public static int price=0;
     public static int sum=0;
     public static int amount;
      public static int amountak=10,amountm4=10;
     public static int totalgunamo=0;
    public static String namemenu="";
    public  int  ame;
    public void shopgun ( String namegun){
       this.namegun=namegun;
    }
     public String shopgun1( ){
        return namegun;
    }
public void amount() {
    Scanner am=new Scanner(System.in);
    System.out.print("Enter amount   :");
    ame=am.nextInt();

}

public void storng(){
      amount();
    totalgunamo=totalgunamo+(amount=amount-this.ame);
       totalgun[number]= amount;
}
public  void buy(){ 
    System.out.println(gun[number] = " "+namemenu +" Price "+ price+"  Bath");
     amount();
    totalgunamo=totalgunamo+(amount=amount-this.ame);
       totalgun[number]= amount;
       
       totalprice[number]=price;
       sum=sum+(price);
         number++;       
}
public  void Selectall(){
        for (int j=0;j < number ;j++ )	{
        
            if(gun[j]==null){
            }
         
            System.out.println(gun[j]);
                  if(amount>0){
                      
                      System.out.println(" Amount   "+totalgun[j]);
                  }else{
                System.out.println("Emtry");
            }
         
        }
      
        }

    @Override
    public void Calculator() {
       System.out.println("Total  "+sum);
    }

        

}
 
   

     
    
    

    

