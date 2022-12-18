//number of 4 digit number
import java.util.*;
public class num_4digit
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
            if(a[i] >= 10000 && a[i] < 100000)
            {
                c = c + 1;
            }
            
        }
        System.out.println(c);
    }
}