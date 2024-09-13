public class HoneyOrder_Fix
{
   private String honeyType;
   private int amount; //honey amount in pounds
         
   // constuctor
   /**
       no arg constuctor 
   */
   public HoneyOrder_Fix()
   {
      honeyType = "";
      amount = 0; 
   }
   /**
      constuctor that take arguments
      @param type gets the honey type
      @param pound get how many pounds the user want
   */
   public HoneyOrder_Fix(String type, int pound)
   {
      honeyType = type;
      amount = pound;
   }  
   // setter methodes
   /**
      setHoneyType
   */
   public void setHoneyType(String t)
   {
      honeyType = t;
   }
   /**
      setOrderPound
   */
   public void setOrderPound(int p)
   {
      amount= p;
   }
   
   // getter methods
   
   /**
      getHoneyName
      @return the name of the honey choosen
   */
   public String getHoneyName()
   {
      return honeyType;
   }
   
   /**
      getorderPound
      @return how many pounds of honey ordered
    */
   public double getAmount()
   {
      return amount;
   }
         
   /**
      getTotalPrice
      @return the total price of the amount of honey ordered
   */
   public double getTotalPrice()
   {
      return amount * getHoneyCost();
   }
   
   /**
      getBottleSize6
      @return the how much bottle is need for 6lb honey
   */
   public int getBottleSize6()
   {
      return amount/6;
   }
   
   /**
      getBottleSize3
      @return the how much bottle is need for 3lb honey
   */
   public int getBottleSize3()
   {
      return (amount%6)/3;// actual way
   }
   
   /**
      getBottleSize1
      @return the how much bottle is need for 1lb honey
   */
   
   public int getBottleSize1()
   {
      return (amount%6)%3;// new change self update
   }
   
   // other methods
   public double getHoneyCost()
   {
      final int LOWEST_WEIGHT = 35;
      final int HIGHEST_WEIGHT = 36;
      
      double honeyCost = 0.0;
      
      if(honeyType.equalsIgnoreCase("Orange Blossom"))//Orange Blossom
      {
         if(amount <= LOWEST_WEIGHT)
         {
            honeyCost = 1.25;
         }
         else
         {
            honeyCost = 1.15;
         }
      } 
      else if (honeyType.equalsIgnoreCase("Wildflower")) // Wildflower 
      {
         if(amount <= LOWEST_WEIGHT)
         {
            honeyCost = 1.10;
         }
         else
         {
            honeyCost = 1.05;
         }
      }
      else //if(honeyType.equalsIgnoreCase("Clover"))//Clover
      {
         if(amount <= LOWEST_WEIGHT)
         {
            honeyCost = 1.00;
         }
         else
         {
            honeyCost = .97;
         }
      }//  outside if
      return honeyCost;
   }
  
   
}



