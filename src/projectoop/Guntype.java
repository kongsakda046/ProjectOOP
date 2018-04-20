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

public class Guntype extends Store  {
    public void Akark(){
       amount=10;
        namemenu="Akark";
        price=1500;
        reduce();
        
    }
    public void M4A1(){
            amount=10;
        namemenu="M4A1";
        price=500;
        reduce();
    }
    public void RPG(){
            amount=10;
        namemenu="M4A1";
        price=2500;
        reduce();
    }
    public void reduce(){
        super.buy();
    }
    public void Calculator(){
        super.Calculator();
    }
    
}
