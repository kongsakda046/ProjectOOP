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
  public static int at,amou;
  public static Scanner se=new Scanner(System.in);
    public static void main(String[] args) {
        Starprogram();
    }
    public static void Starprogram(){
        System.out.println("****Welcome to Shop Gun*****");
         login();
         runprogram();
    }
    public static void runprogram(){
         if(us.equals("admin")){
             System.out.println("1: Checklistgun");
             System.out.println("2:Checklistgun");
                System.out.println("3:AddAmountGun");
                System.out.println("4:AddAmountAmmo");
                Scanner ae=new Scanner(System.in);
         
                System.out.println("5:log out");
                int aq=ae.nextInt();
                 System.out.println("");
              switch(aq){
            case 1: g.Selectall();break;
            case 2: aw.Selectall();break;
 	case 3:
            System.out.print("Enter amount");
            amou=se.nextInt();
            System.out.println("");
                        s.add(amou);
            break;
            case 4:
            System.out.print("Enter amount");
            amou=se.nextInt();
            System.out.println("");
            a.add(amou);
            break;
            case 5:
                
              }
         }else if(us.equals("user")){
        Scanner menu =new Scanner(System.in);
        System.out.println("1:Shop gun");
        System.out.println("2:Shop Ammo");
        System.out.println("3:cheack bin all");
        System.out.println("0:Log out");
         System.out.println("***************** ");
        System.out.print("Select menu :");
              at=menu.nextInt();;
              System.out.println("***************** ");
    
        
     
             
        switch(at){
            
        
  
            case 1:selecterGun();break;
            case 2 :selecterAMMO();break;
              case 0 :Starprogram();break;
                  case 3 :Checkbin();break;
                  
            default:System.out.println("Select again");break;
        } 
    }
    }
    public static void Checkbin(){
        System.out.println("Ammo+"+aw.Calculator()+"+"+"Gun"+  +g.Calculator());
        int total=0;
        total=aw.Calculator()+g.Calculator();
        System.out.println("Total "+total+" Bath");
        System.out.println("*************************************");
              System.out.println("*************************************");
        runprogram();
    }
        
    public static void login(){
        do{
            Scanner lg = new Scanner(System.in);
            System.out.print(" Username:");
            us=lg.nextLine();
            
             System.out.print(" Password:");
            ps=lg.nextLine();
            
        }while((!(us.equals("admin"))||(!(ps.equals("123456"))))&&(!(us.equals("user"))||(!(ps.equals("123456")))));
        
       
    
    }

public static void selecterAMMO(){
    System.out.println("Buy Gun");
System.out.println("Select gun");
System.out.println("0: Checklist");
System.out.println("1: BB80");
System.out.println("2: AK43");
System.out.println("3: WOR");
System.out.println("4:Check bin");
System.out.println("5:return menu");
       do{
       System.out.print("Enter Number : ");
Scanner select=new Scanner(System.in);
	selectmenu = select.nextInt();
        switch (selectmenu) {
        case 0: aw.Selectall();break; 
 	case 1:System.out.print("Enter amount");
            amou=se.nextInt();
            System.out.println("");
            aw.BB80(amou);
            
            break;
        case 2:System.out.print("Enter amount");
            amou=se.nextInt();
            System.out.println(""); 
            aw.WOR(amou);break;
        case 3:System.out.print("Enter amount");
            amou=se.nextInt();
            System.out.println(""); 
            aw.AK43(amou);break;
        case 4:a.Calculator();break;
        }
       }while(selectmenu!=5);
       runprogram();
}
        
public static void selecterGun(){
    System.out.println("Buy Gun");
System.out.println("Select gun");
System.out.println("0: Checklist");
System.out.println("1: Akar");
System.out.println("2: M4A1");
System.out.println("3: RPG");
System.out.println("4:Check bin");
System.out.println("5:Return menu");
       do{
       System.out.print("Enter Number : ");
Scanner select=new Scanner(System.in);
	selectmenu = select.nextInt();
        switch (selectmenu) {
        case 0: g.Selectall();break; 
 	case 1:
        System.out.print("Enter amount");
            amou=se.nextInt();
              System.out.println(""); 
            g.Akark(amou);break;
        case 2:
        System.out.print("Enter amount");
            amou=se.nextInt();
                      System.out.println(""); 
                       g.M4A1(amou);
                      break;
        case 3: 
        System.out.print("Enter amount");
            amou=se.nextInt();
             System.out.println(""); 
            g.RPG(amou);break;
        case 4:s.Calculator();break;
        }
       }while(selectmenu!=5);
             runprogram();
}
}

