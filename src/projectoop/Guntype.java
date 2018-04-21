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

public class Guntype extends Storegun {
  
    private int sum=0;
    public void Akark(int a){
        count=a;
        namemenu="Akark";
        price=1500;
        reduce();
    
        
    }
     public void M4A1(int a){
              count=a;
        namemenu="M4A1";
        price=500;
        reduce();
    }
     public void RPG(int a){
              count=a;
        namemenu="RPG";
        price=2500;
        reduce();
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
   
    
    public void reduce(){
        super.buy();
    }
    @Override
    public int Calculator(){
     
    return    super.Calculator();
    }
    
}
