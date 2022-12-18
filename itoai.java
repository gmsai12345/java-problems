// i*a[i] - sum
import java.util.Arrays;
import java.io.*;
import java.util.*;
public class itoai
{
    public int dis(int arr[], int n)
    {
        Arrays.sort(arr);
        int sum = 0;
        for(int i = 0; i<arr.length;i++)
        {
            sum = sum + arr[i]*i;
        }
        
        return sum;
        
        
    }
}