import java.util.*;
import java.lang.Math;
public class Palindrome 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter a number:");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int n1=n;
        ArrayList<Integer> array1=new ArrayList<Integer>(100);
        while(n!=0)
        {
            array1.add(n%10);
            n/=10;
        }
        int l1=array1.size();
        double n2=0;
        for(int i=0;i<l1;i++)
        {
            int a=array1.get(i);
            n2=n2+a*(Math.pow(10 , l1-i-1));
        }
        if(n1==n2)
        {
            System.out.print(+n1+" is a Palindrome number\n");
        }
        else
        {
            System.out.print(+n1+" is not a Palindrome number\n");
        }
    }
    
}
