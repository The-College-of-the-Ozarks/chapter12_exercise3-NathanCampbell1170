import java.util.Scanner;
import java.util.*;
class Main 
{   
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded = 18;
      int gallonsNeeded;
      int extraQuartsNeeded;
      Scanner input = new Scanner(System.in);
     while(true)
       {
         try{
         
       
      System.out.print("Enter quarts needed >> ");
      quartsNeeded = input.nextInt();


         }
         catch(InputMismatchException exception)
           {
             System.out.println("This application accepts integers only");
             System.out.print("Enter quarts needed >> ");
            input.nextLine();
             continue;
           }
         break;
    
        }
     gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
         System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts.");
   }
}
