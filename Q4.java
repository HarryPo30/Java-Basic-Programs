import java.util.Scanner;
public class Q4{
    public static void main(String []args){
        Scanner yo= new Scanner(System.in);
        System.out.println("Enter number to check armstrong or not:- ");
        int n=yo.nextInt();
        int temp=n;
        int a,sum=0;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            sum=sum+a*a*a;
        }
        if(temp==sum)
        {
            System.out.println("It is an armstrong number:- "+sum);
        }
        else{
            System.out.println("Not armstrong number...");
        }
    }
}