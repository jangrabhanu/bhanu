import java.lang.*;
import java.util.*;
//this program is the 5 question of the assignment....
class Arrayswap
{
  public static void main(String [] aa)
  {
    Scanner ss=new Scanner(System.in);
    System.out.println("enter the size");
    int a,i,j,temp=0;
    a=ss.nextInt();
    int b[] =new int [a];
    for(i=0;i<a;i++)
    {
   b[i]=ss.nextInt();
    }
    for(i=0;i<a;i++)
    {
      System.out.println(b[i]);
    }
    for(i=0;i<=1;i++)
    {
      int q=0;
      q=b[i];
      b[i]=b[i+1];
      b[i+1]=q;
    }
    for(i=a-3;i<a-1;i++)
    {
      int q=0;
      q=b[i];
      b[i]=b[i+1];
      b[i+1]=q;
    }
    for(i=0;i<a;i++)
    {
      System.out.println(b[i]);
    }
  }
}