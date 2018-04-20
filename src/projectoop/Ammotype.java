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
public class Ammotype extends StoreAmmun {
     public void BB80(int a){
        namemenu="BB80";
        price=100;
        reduce();
    
        
    }
     public void AK43(int a){
            
        namemenu="AK43";
        price=200;
        reduce();
    }
     public void WOR(int a){
            
        namemenu="WOR";
        price=300;
        reduce();
    }
   
public  void Selectall(){
        for (int j=0;j < number ;j++ )	{
        
            if(Ammo[j]==null){
            }
         
            System.out.println(Ammo[j]);
                  if(amount>0){
                      
                      System.out.println(" Amount   "+totalAmmo[j]);
                  }else{
                System.out.println("Emtry");
            }
        }
      
        }
   
    
    public void reduce(){
        super.buy();
    }
    public void Calculator(){
        super.Calculator();
    }
    
}
