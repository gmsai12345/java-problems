import java.io.*;
import java.util.*;
import java.lang.*;
class neggn{
    
   
    // Function for finding maximum and value pair
    public static void isFit (int arr[], int n) {
        int count = 0;
           int a[] = new int[n];
        for(int i = 0; i<n;i++)//if we want to compare same index element one for loop is enough
        {
            //for(int j = i;j < brr.length-i;j++ )
            
                    
                    if(arr[i] < 0 )
                    {
                        a[i] = arr[i]; 
                        a[0]++;
                    }
                    else{
                        a[i] = 0;
                    }
                
        }
        for(int j = 0;j<a.length;j++)
        {
            System.out.print(a[j] + " ");
        }
        
    }
}
