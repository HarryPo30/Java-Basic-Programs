import java.util.Scanner;

public class Q2{
    public static void main(String []args){

        Scanner yo = new Scanner(System.in);

        System.out.println("Enter the range of number to find Sum:- ");
        int a= yo.nextInt();
        int sum=0, y;

        for(y=0; y<=a; y++)
        {
            sum=sum+y;
        }
        System.out.println("Sum of the numbers is:- "+sum);

    }
}
