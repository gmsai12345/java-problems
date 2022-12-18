// to check if array elements are amstrong
import java.util.*;
public class armstrongarray
{
    public void display()
    {
        int p,t,d;
        int s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter len");
        p = sc.nextInt();
        System.out.println("enter the array");
        int a[] = new int[p];
        for(int i = 0; i< p;i++)
        {
            a[i] = sc.nextInt();
            t = a[i];
            while(t!=0)
            {
                d = t%10;
                s = s + d^3;
                d = d/10;
            }
            if(s == a[i])
            
                a[i] = 0;
            
            
        }
        for(int i = 0;i<p;i++)
        {
            System.out.print(a[p] + " ");
        }
    }
}