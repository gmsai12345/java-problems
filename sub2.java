public class sub2
{
    public void sub2(int arr[], int n)
    {
        int sum = 0;
        int p2 = 0;
        int flag = 0;
        for(int i = 0; i < arr.length;i++)
        {
            
            
            while(sum <= n)
            {
                sum = sum + arr[i];
                p2 = i;
                flag = flag + 1;
            }
        }
        System.out.println(p2);
        System.out.println(p2+flag);

    }
}