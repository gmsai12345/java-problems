// sortung the array and comparing maximum value
import java.io.*;
import java.util.*;
import java.lang.*;
class brr{
    
   
    // Function for finding maximum and value pair
    public static void isFit (int arr[], int brr[], int n) {
        int count = 0;
           Arrays.sort(arr);
    Arrays.sort(brr);
        for(int i = 0; i<n;i++)//if we want to compare same index element one for loop is enough
        {
            //for(int j = i;j < brr.length-i;j++ )
            {
                    
                    if(arr[i] <= brr[i] )
                    {
                        count  = count + 1;
                    }
                
        }
        
    }
    if(count == n)
        {
            System.out.println("Yes" );
            System.out.println(count );
        }
        else{
            System.out.println("No" );
            System.out.println(count );
        }
}
}