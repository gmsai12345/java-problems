//average of even numbers
import java.util.*;
public class avgeven
{
    public void display()
    {
        int p;
        int s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter len");
        p = sc.nextInt();
        int a[] = new int[p];
        System.out.println("enter elements");
        for(int i = 0; i < p; i++)
        {
            a[i] = sc.nextInt();
            if(a[i] % 2 == 0)
            {
                s = s + a[i];
            }
        }
        int j = p/2;
        System.out.println(s/j);
    }
}