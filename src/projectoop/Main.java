/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;
import java.util.Scanner;

/**
 *
 * @author I'din na
 */
public class Main {
public static String admin="admin";
public static String passwordadmin="123456";
public static String user="user";
public static String passworduser="123456";
public static String us,ps,selectguns;
public static int i,numbergun,selectmenu;
 public static  Storegun s=new Storegun();
  public static      Guntype g=new Guntype();
  public static StoreAmmun a=new StoreAmmun();
  public static Ammotype aw=new Ammotype();
  public static int at;
    public static void main(String[] args) {
         login();
         if(us.equals("admin")){
             System.out.print("a");
         }else if(us.equals("user")){
        Scanner menu =new Scanner(System.in);
        System.out.println("Select menu ");
        at=menu.nextInt();
             
        switch(at){
            
        
  
            case 1:selecterGun();break;
            case 2 :selecterAMMO();break;
              case 3 :login();break;
            default:System.out.println("Select again");break;
        } 
    }
    }
        
    public static void login(){
        do{
            Scanner lg = new Scanner(System.in);
            System.out.print(" Username:");
            us=lg.nextLine();
            
             System.out.print(" Password:");
            ps=lg.nextLine();
            
        }while((!(us.equals("admin"))||(!(ps.equals("123456"))))&&(!(us.equals("user"))||(!(ps.equals("1234")))));
        
       
    
    }

public static void selecterAMMO(){
    System.out.println("Buy Gun");
System.out.println("Select gun");
System.out.println("0: Checklist");
System.out.println("1: BB80");
System.out.println("2: AK43");
System.out.println("3: WOR");
System.out.println("4:Check bin");
System.out.println("5:Exit");
       do{
       System.out.print("Enter Number : ");
Scanner select=new Scanner(System.in);
	selectmenu = select.nextInt();
        switch (selectmenu) {
        case 0: g.Selectall();break; 
 	case 1:g.Akark(10);break;
        case 2: g.M4A1(10);break;
        case 3: g.RPG(10);break;
        case 4:s.Calculator();break;
        }
       }while(selectmenu!=5);
}
        
public static void selecterGun(){
    System.out.println("Buy Gun");
System.out.println("Select gun");
System.out.println("0: Checklist");
System.out.println("1: Akar");
System.out.println("2: M4A1");
System.out.println("3: RPG");
System.out.println("4:Check bin");
System.out.println("5:Exit");
       do{
       System.out.print("Enter Number : ");
Scanner select=new Scanner(System.in);
	selectmenu = select.nextInt();
        switch (selectmenu) {
        case 0: g.Selectall();break; 
 	case 1:g.Akark(10);break;
        case 2: g.M4A1(10);break;
        case 3: g.RPG(10);break;
        case 4:s.Calculator();break;
        }
       }while(selectmenu!=5);
}
}

