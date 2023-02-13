import java.util.Scanner;
public class Q16
{   

    static int nCr(int n, int r)  
    {
          return fact(n) / (fact(r) * fact(n - r));  
    } 
    static int fact(int n)   
    {   
          int res = 1;   
          for (int i = 2; i <= n; i++)   
          res = res * i;   
          return res;   
    }   
   public static void main(String[] args)   
   {   
       Scanner yo=new Scanner(System.in);
       System.out.println("enter n and r values" );
       int n=yo.nextInt();
       int r=yo.nextInt();
       System.out.println("The entered value of n is :"+ n);  
       System.out.println("The entered value of r is :"+ r);
        if(n>=r)
	
            System.out.println("Value of "+ n+"C"+r+"= "+nCr(n, r)); 
		else
		  System.out.println("N should be >=r");


   }   
}  