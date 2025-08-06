import java.util.Scanner;
public class IndianRupeesToUSDollars{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Indian Rupees: ");
        double indianRupees = sc.nextDouble();
        double usDollars = (indianRupees)/(88);

        System.out.println(String.format("%f Indian Rupees = %f US Dollars.", indianRupees,usDollars));
    }
}