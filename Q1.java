import java.util.Scanner;

public class Q1{
    public static void main(String []args){

        Scanner yo= new Scanner(System.in);
        
        System.out.println("Enter the Range until Numbers displayed:- ");
        int a= yo.nextInt();
        int i;

        for(i=1; i<=a; i++)
        {
            System.out.println("The Number within the range is:- "+i);
        }



    }
}