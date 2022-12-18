// finding number less than right and greater than left
import java.util.*;
public class leftright
{
    public int leftright(int arr[],int n)
    {
        int m = 0;
        for(int i = 0; i < arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i] < arr[j+1] && arr[i] > arr[j-1])
                {
                    m = arr[i];
                    i = i + 1;
                    return m;
                    
                }
            }
        }
        System.out.print(m);
        return m;
    }
}