//average of odd and even numbers
import java.util.*;
public class avgoddeven
{
    public void display()
    {
      Scanner sc = new Scanner(System.in);
      int p;
      int so = 0;
      int so1 = 0;
      int se = 0;
      int se1 = 0;
      System.out.println("enter length");
      p = sc.nextInt();
      System.out.println("enter the array");
      int a[] = new int[p];
      for(int i = 0; i< p; i++)
      {
          a[i] = sc.nextInt();
          
          if(a[i] % 2 == 0)
          {
              so1++;
              so = so + a[i];
          }
          else
          {
              se1++;
              se = se + a[i];
          }
          
      }
      System.out.println(so/so1);
          System.out.println(se/se1);
    }
}