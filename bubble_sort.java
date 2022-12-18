
// bubble sort
import java.util.*;
public class bubble_sort
{
    public void display()
    {
        int p, temp, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array len");
        p =sc.nextInt();
        int a[] = new int[p];
        System.out.println("enter array");
        
        for(i = 0; i <  a.length - 1; i++)
        {
            a[i] = sc.nextInt();

            for(int j = 0; j < a.length - 1 - i;j++)
            { 
                while(a[j] < a[j+1])
                {
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
   
                }
            }
        }
         for(i = 0; i <  p-1; i++)
        {
             System.out.print(a[i] + " ");
}
}
}
}