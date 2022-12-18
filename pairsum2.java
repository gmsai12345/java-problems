public class pairsum2
{
    public void pairsum(int arr[], int x)
    {
        int flag = 0;
        for(int i =0;i<arr.length-1;i++)
        {
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[i] + arr[j] == x)
                {
                    flag = flag + 1;
                }
                else{
                    i++;
                }
            }
        }
        System.out.print(flag);
    }
}