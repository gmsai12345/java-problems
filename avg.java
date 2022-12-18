
//average of array
import java.util.*;
public class avg
{
    public void avg()
    {
        int p;
        int s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter len");
        p = sc.nextInt();
        int a[] = new int[p];
        System.out.println("enter the array elements");
        for(int i = 0; i < p; i++)
        {
            a[i] = sc.nextInt();
            s = s + a[i];
        }
        System.out.println(s/p);
    }
}