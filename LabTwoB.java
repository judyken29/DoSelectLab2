package lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
 
public class LabTwoB 
{
    public static void main(String[] args) 
    {
    int count;
        Scanner scan = new Scanner(System.in);
         
        
        System.out.print("Enter number of strings: ");
        count = scan.nextInt();
         
        String strArray[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
         
      
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            strArray[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
         
      
        strArray = Stream.of(strArray).sorted().toArray(String[]::new);
         
  
        System.out.print("Strings in Sorted Order: " + Arrays.toString(strArray));
    }
}
