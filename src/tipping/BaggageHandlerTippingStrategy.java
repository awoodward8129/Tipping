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
public class BaggageHandlerTippingStrategy implements TippingStrategy {
    
   
   
    
    @Override
    public final double getTip() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many bags do you have?");
        int bags = Integer.parseInt(keyboard.nextLine());
        double amount =0;
        if(bags == 0 )
            System.out.println("You have to have a bag to tip");
        else if(bags == 1)
            amount =2;
        else if(bags> 1)
            amount = bags;
           
        System.out.println("the amount you should tip is as follows:");
        return  amount;
    }
    
}
