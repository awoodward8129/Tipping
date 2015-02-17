
package tipping;


public class StartUp {
    
      public static void main(String[] args) {
        
          TippingStrategy thisTipper = new BaggageHandlerTippingStrategy();
                                        // new ResaurantTippingStrategy();
          System.out.println(thisTipper.getTip());
          
    }
}
