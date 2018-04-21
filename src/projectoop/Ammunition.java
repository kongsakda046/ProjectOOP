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
interface  Ammunition {
 public static String Ammo[] = new String[99]; 
   public static int totalAmmo[] = new int[99];
  public static int totalpriceAmmo [] = new int[99];
     public static  void amount(){
       int amount=100;
   }
   public void buy();
      public int Calculator();
}

