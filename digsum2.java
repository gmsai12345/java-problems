//sum of 2 digits
import java.util.*;
public class digsum2
{
    public void d5()
    {
        int p;
        int c = 0;
        String s = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter len");
        p = sc.nextInt();
        System.out.println("enter array");
        int a[] = new int[p];
        for(int i = 0; i < p; i++)
        {
            a[i] = sc.nextInt();
            if(a[i] >= 10 && a[i] < 100)
            {
                c = c + a[i];
            }
            
        }
        System.out.println(c);
    }
}