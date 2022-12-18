//sum of even numbers
import java.util.*;
public class even_sum
{
    public void display()
    {
        int s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array length");
        int p = sc.nextInt();
        int a[] = new int[p];
        System.out.println("enter array");
        for(int i = 0; i < p;i++)
        {
            a[i] = sc.nextInt();
            if(a[i] % 2 == 0)
            {
                s = s + a[i];
            }
        }
        System.out.println(s);
    }
}