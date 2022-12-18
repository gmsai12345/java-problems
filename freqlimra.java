public class freqlimra
{
    public void freqlimra(int arr[], int n)
    {
        int a[] = new int[n];
        for(int i =0;i < arr.length;i++)
        {
            for(int j = i +1;j<arr.length-i;j++)
            {
                if(arr[i] == a[j])
                {
                    a[i]++;
                    i = i +1; 
                }
                else{
                    i = i + 1;
                }
                
            }
        }
        for(int k = 0;k<a.length;k++)
        {
            System.out.print(a[k] + " ");
        }
    }
}