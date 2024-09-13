public class HoneyOrder
{
   private int honeyType;
   private int orderPound;
   private double totalPrice;
   private double honeycost;
   private int bottleSize6;
   private int bottleSize3;
   private int bottleSize1;
   
   // constuctor
   /**
       no arg constuctor 
   */
   public HoneyOrder()
   {
      honeyType = 0;
      orderPound = 0;
      totalPrice = 0.0;
      honeycost = 0.0;
      bottleSize6 = 0;
      bottleSize3 = 0;
      bottleSize1 = 0;
   }
   /**
      constuctor that take arguments
      @param type gets the honey type
      @param pound get how many pounds the user want
   */
   public HoneyOrder(int type, int pound)
   {
      honeyType = type;
      orderPound = pound;
   }  
   // setter methodes
   /**
      setHoneyType
   */
   public void setHoneyType(int t)
   {
      honeyType = t;
   }
   /**
      setOrderPound
   */
   public void setOrderPound(int p)
   {
      orderPound = p;
   }
   
   // getter methods
   
   /**
      getorderPound
      @return how many pounds of honey ordered
    */
   public double getorderPound()
   {
      return orderPound;
   }
         
   /**
      getTotalPrice
      @return the total price of the amount of honey ordered
   */
   public double getTotalPrice()
   {
      return  totalPrice = orderPound * honeycost;
   }
   
   //the calcuation maybe wrong i dont know how to calcuate how many bottle need
   
   /**
      getBottleSize6
      @return the how much bottle is need for 6lb honey
   */
   public int getBottleSize6()
   {
      return bottleSize6 = orderPound/6;
   }
   
   /**
      getBottleSize3
      @return the how much bottle is need for 3lb honey
   */
   public int getBottleSize3()
   {
      return bottleSize3 = (bottleSize6)%3;// new change self update
   }
   
   /**
      getBottleSize1
      @return the how much bottle is need for 1lb honey
   */
   
   public int getBottleSize1()
   {
      return bottleSize1 = orderPound -((bottleSize6 *6)+(bottleSize3*3));// new change self update
   }
   
     /**
      getHoneyName
      @return the name of the honey choosen
   */
   public String getHoneyName()
   {  
      String honeyName = "";
      switch(honeyType)
      {
         case 1:
            honeyName = "Orange Blossom";
            break;
         case 2:
            honeyName = "Wildflower";
            break;
         case 3:
            honeyName = "Clover";
            break;
         default:
            honeyName = "";
            break;
      }
      return honeyName;
   }
   // other methods
   public double findHoneyCost()
   {
      final int LOWEST_WEIGHT = 35;
      final int HIGHEST_WEIGHT = 36;
      //Orange Blossom
      if(honeyType == 1)
      {
         if( orderPound <= LOWEST_WEIGHT)
         {
            honeycost = 1.25;
         }
         else if (orderPound > HIGHEST_WEIGHT)
         {
            honeycost = 1.15;
         }
      }
      // Wildflower cost
      if(honeyType == 2)
      {
         if( orderPound <= LOWEST_WEIGHT)
         {
            honeycost = 1.10;
         }
         else if (orderPound > HIGHEST_WEIGHT)
         {
            honeycost = 1.05;
         }
      }
      //Clover
      if(honeyType == 3)
      {
         if( orderPound <= LOWEST_WEIGHT)
         {
            honeycost = 1.00;
         }
         else if (orderPound > HIGHEST_WEIGHT)
         {
            honeycost = .97;
         }
      }
      return honeycost;
   }
  
   
}