/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tipping;

/**
 *
 * @author Alex
 */
public class TipService {
    
   
    
    public final double getTip(TippingStrategy tipper){
    return tipper.getTip();
    };
}
