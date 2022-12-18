//sum of 2 numbers= k
public class doubletriple
{
    public void display(int arr[], int n, int k)
    {
        int a,b;
        int flag = 0;
        for(int i = 0; i < arr.length;i++)
        {
            for(int j = i+1;j <arr.length;j++)
            {
               
                    a = arr[i];
                    b = arr[j];
                    
                     if (a + b == k)
                     {
                         flag = 1;
                     }
                    
                
            }
        }
        if(flag == 1)
        {
            System.out.print("1");
        }
        else
        {
            System.out.print("-1");
        }
        
    }
}