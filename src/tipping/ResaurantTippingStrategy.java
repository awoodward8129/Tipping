/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tipping;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class ResaurantTippingStrategy implements TippingStrategy {

    @Override
    public final double getTip() {
         double tip =0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much was your bill?");
       double amount = Double.parseDouble(keyboard.nextLine());
        System.out.println("How good was your service (0) bad, (1)ok  or (2)good ");
        int quality = Integer.parseInt(keyboard.nextLine());
        if (quality == 0)
          tip = amount * .10;
        else if( quality == 1)
          tip = amount * .15;
        else 
          tip = amount * .20;
        
       double total = tip + amount;
       
        System.out.println("Your total bill will be:");
        
        
        return total;
    }
    
}
