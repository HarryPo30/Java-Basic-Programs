import java.util.Scanner;
public class Q12{
    public static void main (String[] ar){
        Scanner yo=new Scanner(System.in);
        System.out.println("Enter the rupee rate for 1 doller:- ");
        double rup_rate=yo.nextDouble();

        System.out.println("Enter the number of dollers:-  ");
        double dol_count=yo.nextDouble();
        double c=dol_count*rup_rate;

        System.out.println("Doller to rupee converted price:- "+c);


    }
}