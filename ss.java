// printing numbers positive and negative seperately
public class ss
{
    public void ss(int arr[], int n)
    {
        int count = 0;
        int a[] = new int[n-count];
        int b[] = new int[count];
        
        for(int i =0; i< arr.length;i++)
        {
            if(arr[i] == 0)
            {
            count = count + 1;
        }
        
        if(arr[i] != 0)
        {
            a[i] = arr[i];
        }
        else{
            b[i] = arr[i];
            
        }
    }
    int a1 = n - count;
    int c[] = new int[n];
    for(int i = 0;i<a1;i++)
    {
        c[i] = a[i];
        System.out.print(a[i] + " ");
    }
    for(int i = 0;i<b.length;i++)
    {
        c[a1+i] = b[i];
        System.out.print(b[i] + " ");
    }
    for(int j = 0;j<c.length;j++)
    {
        System.out.print(c[j] + " ");
    }
        System.out.print(count);
        
    }
}