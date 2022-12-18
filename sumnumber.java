
//sum of numbers
import java.util.*;
class sumnumber
{
static void main()
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
int i,s=0;
System.out.println("Enter 10 integers:");
for(i=0;i<5;i++)

{
a[i]=sc.nextInt();
s+=a[i];
}
System.out.println("Sum of the numbers:"+s);
}
}