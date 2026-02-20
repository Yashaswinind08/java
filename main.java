//printing my name
import java.util.*;

public class main{
  public static int add(int a,int b){
    int sum=a+b;
    return sum;
    
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum=add(a,b); //function is called here
    System.out.println("the sum of a and b is :" + sum);
    sc.close();
  }
}