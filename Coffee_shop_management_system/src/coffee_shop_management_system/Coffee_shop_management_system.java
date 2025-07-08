/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffee_shop_management_system;

import java.io.File;

public class Coffee_shop_management_system {

       public static void main(String[] args) {
        // TODO code application logic here
        login lp = new login();
        menu m = new menu();
        records r = new records();
        lp.setVisible(true);

      
        try{
        File f = new File("Orders.txt");
        if(f.createNewFile())
        {
            System.out.println("Order file created.");
        }
        }
        catch(Exception e)
         {
           e.printStackTrace();  
         }
    } 
}
