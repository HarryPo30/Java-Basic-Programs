import java.util.Scanner;
public class Q6{
    public static void main(String []args){

        Scanner yo =new Scanner(System.in);

        System.out.println("Enter first number:- ");
        int a=yo.nextInt();
        System.out.println("Enter second number:- ");
        int b=yo.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swapping a:- "+a);
        System.out.println("After swapping b:- "+b);
    }
}