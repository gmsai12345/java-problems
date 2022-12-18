
// check if number of even numbers = odd numbers
public class evenodd
{
    public void display(int arr[], int n)
    {
        int co1 = 0;
        int co2 = 0;
        for(int i = 0; i< arr.length;i++)
        {
            if(arr[i] % 2 == 0)
            {
                co1 = co1 + 1;
            }
            else{
                co2 = co2 + 1; 
            }
        }
        if(co1 == n/2 && co2 == n/2){
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
    }
}