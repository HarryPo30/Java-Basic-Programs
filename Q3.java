import java.util.Scanner;
public class Q3{
    public static void main(String []args)
{
        Scanner yo= new Scanner(System.in);

        System.out.println("Enter the number to check palindrome:- ");

        int num= yo.nextInt();
        int org=num;
        int rev=0;

        while(num != 0)
        {
            rev=rev*10 + num%10;

            num= num/10;
        }
        if(org==rev){
            System.out.println("Yes it is palindrome:- "+org);
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
    
}