import java.util.Scanner;

public class Q8{
    public static void main(String []args){

        Scanner yo=new Scanner(System.in);

        System.out.println("Enter the char to find ASCII value:- ");
        char a= yo.next().charAt(0);

        int b=a;

        System.out.println("ASCII value of the given character is:- "+b);
    
    }
}