// number of non repeating elements
public class arraysubset
{
    public void pairsum(int arr[], int brr[])
    {
        int flag = 0;
        for(int i =0;i<arr.length-1;i++)
        {
            
            for(int j = i+1; j<brr.length;j++)
                if(arr[i] != brr[j])
                {
                    flag = i;
                    
                
               
                }
        
            
        
            }
        System.out.println(flag);
        }
    }
