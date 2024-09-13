import java.util.ArrayList;
import java.util.Scanner;
public class Demo
{
   public static void main(String[]arg)
   {
      int honeyChoice = 0;
      int numPounds = 0;
      String choice= "";
      
      
      Scanner keyboard = new Scanner(System.in);
      ArrayList<HoneyOrder> orderList = new ArrayList<HoneyOrder>();
      //hile loop that runs untill user wish to stop 
      while (!choice.equalsIgnoreCase("N"))// new change
      {
      // ask for user input 
         
         System.out.print("Enter honeyChoice: ");
         honeyChoice = keyboard.nextInt();
         
         while(honeyChoice < 1 || honeyChoice > 3) 
         {
            System.out.println("Please enter value greater than 1 or less than 3");
            System.out.print("Enter honeyChoice: ");
            honeyChoice = keyboard.nextInt();
         }
         
        
      
         System.out.print("Enter the number of pounds : ");
         while(!(keyboard.hasNextInt()))
         {
            System.out.println("retry");
            System.out.print("Enter the number of pounds ");
            keyboard.nextLine();//buffer to clear the line
         }
         numPounds = keyboard.nextInt();
         
         
         System.out.print("Do you wish to enter infomation for another order (Y/N)?");
         keyboard.nextLine();//buffer to clear the line   also new change
         choice = keyboard.nextLine();
         
         
         //append inputed information into an array
         orderList.add(new HoneyOrder(honeyChoice, numPounds));
      } //while loop
      
      // display
      for(HoneyOrder order : orderList)
      {
         System.out.println("Type of honey: " +order.getHoneyName());
         System.out.println("Amount (lb): "+order.getorderPound());
         order.findHoneyCost();
         System.out.println("Price: "+order.getTotalPrice());
         System.out.println("No. 6lb bottles: "+order.getBottleSize6());
         System.out.println("No. 3lb bottles: "+ order.getBottleSize3());
         System.out.println("No. 1lb bottles: "+order.getBottleSize1());// gixed 
      }
      
      
      
   }
}