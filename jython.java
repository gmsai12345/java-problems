import java.util.*;
public class jython
{
    public void jython(int arr[], int x)
    {
        int flag = 0;
        int v = 0;
        for(int i = 0 ; i<x-1;i++)
        {
            for(int j = i+1;j < x;j++ )
            {
                while(flag <= 1)
                if(arr[i] == arr[j])
                {
                    flag = flag + 1;
                    v = i;
                    
                    break;
                }
                else if(arr[i] == arr[j])
                {
                    v = 1;
                }
                else{
                    i = i+1;
                }
                
                
            }
            
        }
        System.out.println(v);
    }
}