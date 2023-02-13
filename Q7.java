import java.util.Scanner;

public class Q7{
    public static void main(String []args){

        Scanner yo=new Scanner(System.in);

        System.out.println("Enter the number to find the facotrial:- ");
        int a=yo.nextInt();
        int i,f=1;
        for(i=1;i<=a;i++)
        {
            f=f*i;
        }

        System.out.println("Factorial of the entered number is:- "+f);
    }
}