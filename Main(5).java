/* Write a program using integers userNum and divNum as input, and output userNum divided by divNum three times. 
Note: End with a newline. */

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
     
      Scanner keyboard = new Scanner(System.in);
      
      int userNum;
      int divNum;
      
      userNum = keyboard.nextInt();
      divNum = keyboard.nextInt();
      
      
      for (int i = 0; i < 2; i++) {
         
         userNum = userNum / divNum;
         System.out.print (userNum + " ");
         
         }
         
         userNum = userNum / divNum;
         System.out.println (userNum);
   }
}
