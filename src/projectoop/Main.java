/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectoop;
import java.util.Scanner;
import static projectoop.Store.selectmenu;
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
public static int i,numbergun;
 public static  Store s=new Store();
  public static      Guntype g=new Guntype();
    public static void main(String[] args) {
       /* do{
            Scanner lg = new Scanner(System.in);
            System.out.print(" Username:");
            us=lg.nextLine();
            
             System.out.print(" Password:");
            ps=lg.nextLine();
            
        }while(!(us.equals("admin"))||!(ps.equals("123456"))&&!(us.equals("user")));
        */
       
       /* Scanner nummber=new Scanner(System.in);
        System.out.print("Enter count gun ");
        numbergun=nummber.nextInt();
       Scanner gun = new Scanner(System.in);
        System.out.println("Select gun ");
        for(i=0;i<numbergun;i++){
       
        selectguns=gun.nextLine();
       
        s.shopgun(selectguns);
   
        }*/
       System.out.println("Buy Gun");
System.out.println("Select gun");
System.out.println("0: Checklist");
System.out.println("1: Akar");
System.out.println("2: M4A1");
System.out.println("3: RPG");
System.out.println("4:Check bin");
System.out.println("5:Exit");
Star();
        }
public static void Star(){
       do{
       System.out.print("Enter Number : ");
Scanner select=new Scanner(System.in);
	selectmenu = select.nextInt();
        switch (selectmenu) {
        case 0: g.Selectall();break; 
 	case 1:  g.Akark();break;
        case 2: g.M4A1();break;
        case 3: g.RPG();break;
        case 4:s.Calculator();break;
        }
       }while(selectmenu!=5);
}
}

