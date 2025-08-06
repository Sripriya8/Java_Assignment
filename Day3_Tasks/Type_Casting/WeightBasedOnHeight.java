import java.util.Scanner;
public class WeightBasedOnHeight{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();
        double target_BMI = 22;
        double weight = target_BMI * height * height;

        System.out.print(String.format("The person with %.2fm height will have %.2fkg approximate weight.", height, weight));
    }
}