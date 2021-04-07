package lab;

import java.util.Scanner;

public class LabTwoA
{
    public static void main(String[] args) 
    {
    	
        int n, min;
        Scanner Sc = new Scanner(System.in);
        
      
        System.out.print("Enter number of elements : ");
        n = Sc.nextInt();
        
      
        
        int a[] = new int[n];
        
       
        System.out.println("Enter the elements in array : ");
        for (int i = 0; i < n; i++) 
        {
            a[i] = Sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    min = a[i];
                    a[i] = a[j];
                    a[j] = min;
                }
            }
        }
        System.out.println("The 2nd smallest element in the array is :"+a[1]);
    }
}
