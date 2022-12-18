
import java.util.*;
public class howmuchnum
{
    public void display()
    {
        int p, temp = 0;
        int counter = 0;
        //boolean swapped;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter len");
        p = sc.nextInt();
        System.out.println("enter array");
        int a[] = new int[p];
        for(int i = 0;i<p-1;i++)
        {
            //swapped = false;
            a[i] = sc.nextInt();
            
               
                if(a[i] != a[i+1])
                {
                   
                
                counter = counter + 1;
                //swapped = true;
            }
        }
        System.out.println(counter);
    }
    //if(swapped == true)
    //{
        
        
        //for(int q = 0; q < p-1;q++)
        //{
           // System.out.print(a[i] + " ");
       // }
    //}
    
}
