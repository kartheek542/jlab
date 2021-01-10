import java.util.Scanner;
import java.util.Random;
class Cube implements Runnable
{
  int num;
  public Cube(int n)
  {
    num = n;
  }
  public void run()
  {
    System.out.println("the cube of "+num+" is "+num*num*num);
  }
}
class Square implements Runnable
{
  int num;
  public Square(int n)
  {
    num = n;
  }
  public void run()
  {
    System.out.println("the square of "+num+" is "+num*num);
  }
}
public class ThreeThreads
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Random rand = new Random();
    int i;
    for(i=0;i<n;i++)
    {
      int num = rand.nextInt(1000);
      System.out.println("the number is "+num);
      if(num%2 == 0)
      {
        Runnable sq = new Square(num);
        Thread t2 = new Thread(sq);
        t2.start();
      }
      else
      {
        Runnable cu = new Cube(num);
        Thread t3 = new Thread(cu);
        t3.start();
      }
      try {Thread.sleep(1000);} catch(Exception e) {}
    }
  }
}
